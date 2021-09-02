package net.dugged.schematicconverter.block;

public class BlockDeadTubeCoralBlock extends Block {
	public BlockDeadTubeCoralBlock() {
		super("dead_tube_coral_block");
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