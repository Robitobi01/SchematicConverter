package net.dugged.schematicconverter.block;

public class BlockPottedWhiteTulip extends Block {
	public BlockPottedWhiteTulip() {
		super("potted_white_tulip");
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