package net.dugged.schematicconverter.block;

public class BlockCyanTerracotta extends Block {
	public BlockCyanTerracotta() {
		super("cyan_terracotta");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteTerracotta().setMetadata(9);
	}
}