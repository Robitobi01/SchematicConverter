package net.dugged.schematicconverter.block;

public class BlockPottedBamboo extends Block {
	public BlockPottedBamboo() {
		super("potted_bamboo");
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