package net.dugged.schematicconverter.block;

public class BlockGreenTerracotta extends Block {
	public BlockGreenTerracotta() {
		super("green_terracotta");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteTerracotta().setMetadata(13);
	}
}