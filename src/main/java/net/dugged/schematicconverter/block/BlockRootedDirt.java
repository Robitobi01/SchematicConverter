package net.dugged.schematicconverter.block;

public class BlockRootedDirt extends Block {
	public BlockRootedDirt() {
		super("rooted_dirt");
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