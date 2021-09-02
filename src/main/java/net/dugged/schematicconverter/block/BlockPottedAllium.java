package net.dugged.schematicconverter.block;

public class BlockPottedAllium extends Block {
	public BlockPottedAllium() {
		super("potted_allium");
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