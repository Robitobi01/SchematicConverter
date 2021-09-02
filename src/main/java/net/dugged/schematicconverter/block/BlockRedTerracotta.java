package net.dugged.schematicconverter.block;

public class BlockRedTerracotta extends Block {
	public BlockRedTerracotta() {
		super("red_terracotta");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteTerracotta().setMetadata(14);
	}
}