package net.dugged.schematicconverter.block;

public class BlockBrainCoralBlock extends Block {
	public BlockBrainCoralBlock() {
		super("brain_coral_block");
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