package net.mcreator.changedplusindustry.procedures;

import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicInteger;

public class LPimportProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        BlockPos currentPos = new BlockPos(x, y, z);

        if (getEnergyStored(world, currentPos) != 0 && !isAir(world, currentPos)) {
            BlockPos[] adjacentPositions = {
                currentPos.east(),
                currentPos.west(),
                currentPos.above(),
                currentPos.below(),
                currentPos.south(),
                currentPos.north()
            };

            for (BlockPos adjacentPos : adjacentPositions) {
                if (getMaxEnergyStored(world, adjacentPos) != 0 && !isAir(world, adjacentPos)) {
                    transferEnergy(world, currentPos, adjacentPos, 50);
                    break; // 只传输到一个相邻的方块
                }
            }
        }
    }

    private static boolean isAir(LevelAccessor level, BlockPos pos) {
        return level.getBlockState(pos).getBlock() == Blocks.AIR;
    }

    private static int getEnergyStored(LevelAccessor level, BlockPos pos) {
        AtomicInteger energyStored = new AtomicInteger(0);
        BlockEntity blockEntity = level.getBlockEntity(pos);
        if (blockEntity != null) {
            blockEntity.getCapability(CapabilityEnergy.ENERGY, null)
                .ifPresent(capability -> energyStored.set(capability.getEnergyStored()));
        }
        return energyStored.get();
    }

    private static int getMaxEnergyStored(LevelAccessor level, BlockPos pos) {
        AtomicInteger maxEnergyStored = new AtomicInteger(0);
        BlockEntity blockEntity = level.getBlockEntity(pos);
        if (blockEntity != null) {
            blockEntity.getCapability(CapabilityEnergy.ENERGY, null)
                .ifPresent(capability -> maxEnergyStored.set(capability.getMaxEnergyStored()));
        }
        return maxEnergyStored.get();
    }

    private static void transferEnergy(LevelAccessor level, BlockPos fromPos, BlockPos toPos, int amount) {
        BlockEntity fromEntity = level.getBlockEntity(fromPos);
        BlockEntity toEntity = level.getBlockEntity(toPos);
        if (fromEntity != null && toEntity != null) {
            fromEntity.getCapability(CapabilityEnergy.ENERGY, null)
                .ifPresent(fromCapability -> {
                    int extracted = fromCapability.extractEnergy(amount, false);
                    toEntity.getCapability(CapabilityEnergy.ENERGY, null)
                        .ifPresent(toCapability -> toCapability.receiveEnergy(extracted, false));
                });
        }
    }
}
