package net.dugged.schematicconverter.block;

public class BlockLightGrayTerracotta extends Block {
	public BlockLightGrayTerracotta() {
		super("light_gray_terracotta");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteTerracotta().setMetadata(8);
	}
}