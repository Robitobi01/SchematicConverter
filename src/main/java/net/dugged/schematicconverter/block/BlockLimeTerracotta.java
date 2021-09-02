package net.dugged.schematicconverter.block;

public class BlockLimeTerracotta extends Block {
	public BlockLimeTerracotta() {
		super("lime_terracotta");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteTerracotta().setMetadata(5);
	}
}