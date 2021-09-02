package net.dugged.schematicconverter.block;

public class BlockHoneycombBlock extends Block {
	public BlockHoneycombBlock() {
		super("honeycomb_block");
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