package net.dugged.schematicconverter.block;

public class BlockBlueTerracotta extends Block {
	public BlockBlueTerracotta() {
		super("blue_terracotta");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteTerracotta().setMetadata(11);
	}
}