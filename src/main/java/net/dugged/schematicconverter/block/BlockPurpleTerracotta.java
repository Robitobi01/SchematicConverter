package net.dugged.schematicconverter.block;

public class BlockPurpleTerracotta extends Block {
	public BlockPurpleTerracotta() {
		super("purple_terracotta");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteTerracotta().setMetadata(10);
	}
}