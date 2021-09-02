package net.dugged.schematicconverter.block;

public class BlockBlackTerracotta extends Block {
	public BlockBlackTerracotta() {
		super("black_terracotta");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteTerracotta().setMetadata(15);
	}
}