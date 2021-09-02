package net.dugged.schematicconverter.block;

public class BlockPinkTulip extends Block {
	public BlockPinkTulip() {
		super("pink_tulip");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockPoppy().setMetadata(7);
	}
}