package net.dugged.schematicconverter.block;

public class BlockOrangeTerracotta extends Block {
	public BlockOrangeTerracotta() {
		super("orange_terracotta");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteTerracotta().setMetadata(1);
	}
}