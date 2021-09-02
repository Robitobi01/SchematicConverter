package net.dugged.schematicconverter.block;

public class BlockPurpleCarpet extends Block {
	public BlockPurpleCarpet() {
		super("purple_carpet");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteCarpet().setMetadata(10);
	}
}