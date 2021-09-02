package net.dugged.schematicconverter.block;

public class BlockBrownCarpet extends Block {
	public BlockBrownCarpet() {
		super("brown_carpet");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteCarpet().setMetadata(12);
	}
}