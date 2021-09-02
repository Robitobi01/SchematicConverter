package net.dugged.schematicconverter.block;

public class BlockCornflower extends Block {
	public BlockCornflower() {
		super("cornflower");
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