package net.dugged.schematicconverter.block;

public class BlockSmoothBasalt extends Block {
	public BlockSmoothBasalt() {
		super("smooth_basalt");
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