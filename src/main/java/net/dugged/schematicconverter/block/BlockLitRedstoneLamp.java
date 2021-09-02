package net.dugged.schematicconverter.block;

public class BlockLitRedstoneLamp extends Block {

	public BlockLitRedstoneLamp() {
		super("");
		setOldId(124);
		setOldName("lit_redstone_lamp");
		setAsLegacy();
	}

	@Override
	public Block getNewBlock() {
		return new BlockRedstoneLamp().setProperty(BlockRedstoneLamp.lit.getName(), "true");
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}