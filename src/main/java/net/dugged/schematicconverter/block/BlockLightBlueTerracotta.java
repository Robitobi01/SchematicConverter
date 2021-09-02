package net.dugged.schematicconverter.block;

public class BlockLightBlueTerracotta extends Block {
	public BlockLightBlueTerracotta() {
		super("light_blue_terracotta");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteTerracotta().setMetadata(3);
	}
}