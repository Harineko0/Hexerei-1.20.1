package net.joefoxe.hexerei.block.custom;

import net.joefoxe.hexerei.block.ModBlocks;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;

import javax.annotation.Nullable;

public class WillowLog extends RotatedPillarBlock {
    public WillowLog(Properties properties) {
        super(properties);
    }

    @Nullable
    @Override
    public BlockState getToolModifiedState(BlockState state, UseOnContext context,
                                           ToolAction toolAction, boolean simulate) {

        boolean rightClickedWithAxe = ToolActions.AXE_STRIP.equals(toolAction);
        BlockState toReturn = ModBlocks.WILLOW_LOG.get().defaultBlockState();
//
        if(rightClickedWithAxe){
            toReturn = ModBlocks.STRIPPED_WILLOW_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
        }
        return toReturn;
    }
}

