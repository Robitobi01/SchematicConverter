package net.dugged.schematicconverter.block;

public class BlockFireCoralBlock extends Block {
	public BlockFireCoralBlock() {
		super("fire_coral_block");
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