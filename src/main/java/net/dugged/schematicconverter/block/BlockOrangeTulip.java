package net.dugged.schematicconverter.block;

public class BlockOrangeTulip extends Block {
	public BlockOrangeTulip() {
		super("orange_tulip");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockPoppy().setMetadata(5);
	}
}