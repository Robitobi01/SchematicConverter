package net.dugged.schematicconverter.block;

public class BlockPottedPinkTulip extends Block {
	public BlockPottedPinkTulip() {
		super("potted_pink_tulip");
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