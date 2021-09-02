package net.dugged.schematicconverter.block;

public class BlockDeadBrainCoralBlock extends Block {
	public BlockDeadBrainCoralBlock() {
		super("dead_brain_coral_block");
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