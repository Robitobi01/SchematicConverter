package net.dugged.schematicconverter.block;

public class BlockPinkTerracotta extends Block {
	public BlockPinkTerracotta() {
		super("pink_terracotta");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteTerracotta().setMetadata(6);
	}
}