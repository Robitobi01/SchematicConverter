package net.dugged.schematicconverter.block;

public class BlockWhiteTulip extends Block {
	public BlockWhiteTulip() {
		super("white_tulip");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockPoppy().setMetadata(6);
	}
}