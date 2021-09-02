package net.dugged.schematicconverter.block;

public class BlockBrownWool extends Block {
	public BlockBrownWool() {
		super("brown_wool");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteWool().setMetadata(12);
	}
}