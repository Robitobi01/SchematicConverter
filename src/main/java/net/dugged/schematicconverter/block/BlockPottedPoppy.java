package net.dugged.schematicconverter.block;

public class BlockPottedPoppy extends Block {
	public BlockPottedPoppy() {
		super("potted_poppy");
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