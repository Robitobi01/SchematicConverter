package net.dugged.schematicconverter.block;

public class BlockOrangeCarpet extends Block {
	public BlockOrangeCarpet() {
		super("orange_carpet");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteCarpet().setMetadata(1);
	}
}