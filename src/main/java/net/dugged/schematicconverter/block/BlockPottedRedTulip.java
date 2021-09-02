package net.dugged.schematicconverter.block;

public class BlockPottedRedTulip extends Block {
	public BlockPottedRedTulip() {
		super("potted_red_tulip");
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