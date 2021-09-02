package net.dugged.schematicconverter.block;

public class BlockDeadFireCoralBlock extends Block {
	public BlockDeadFireCoralBlock() {
		super("dead_fire_coral_block");
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