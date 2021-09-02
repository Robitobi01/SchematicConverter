package net.dugged.schematicconverter.block;

public class BlockGrayTerracotta extends Block {
	public BlockGrayTerracotta() {
		super("gray_terracotta");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteTerracotta().setMetadata(7);
	}
}