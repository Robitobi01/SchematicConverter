package net.dugged.schematicconverter.block;

public class BlockRedTulip extends Block {
	public BlockRedTulip() {
		super("red_tulip");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockPoppy().setMetadata(4);
	}
}