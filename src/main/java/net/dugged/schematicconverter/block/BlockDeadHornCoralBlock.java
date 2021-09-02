package net.dugged.schematicconverter.block;

public class BlockDeadHornCoralBlock extends Block {
	public BlockDeadHornCoralBlock() {
		super("dead_horn_coral_block");
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