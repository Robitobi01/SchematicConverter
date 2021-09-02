package net.dugged.schematicconverter.block;

public class BlockTerracotta extends Block {
	public BlockTerracotta() {
		super("terracotta");
		setOldId(172);
		setOldName("hardened_clay");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}