package net.dugged.schematicconverter.block;

public class BlockHornCoralBlock extends Block {
	public BlockHornCoralBlock() {
		super("horn_coral_block");
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