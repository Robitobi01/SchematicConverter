package net.dugged.schematicconverter.block;

public class BlockPottedOrangeTulip extends Block {
	public BlockPottedOrangeTulip() {
		super("potted_orange_tulip");
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