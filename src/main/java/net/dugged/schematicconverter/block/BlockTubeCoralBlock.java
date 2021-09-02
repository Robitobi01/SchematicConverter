package net.dugged.schematicconverter.block;

public class BlockTubeCoralBlock extends Block {
	public BlockTubeCoralBlock() {
		super("tube_coral_block");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}