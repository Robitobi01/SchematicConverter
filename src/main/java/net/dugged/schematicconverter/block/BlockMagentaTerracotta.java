package net.dugged.schematicconverter.block;

public class BlockMagentaTerracotta extends Block {
	public BlockMagentaTerracotta() {
		super("magenta_terracotta");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteTerracotta().setMetadata(2);
	}
}