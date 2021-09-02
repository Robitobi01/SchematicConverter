package net.dugged.schematicconverter.block;

public class BlockBrownTerracotta extends Block {
	public BlockBrownTerracotta() {
		super("brown_terracotta");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteTerracotta().setMetadata(12);
	}
}