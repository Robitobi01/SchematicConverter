package net.dugged.schematicconverter.block;

public class BlockSmoothQuartz extends Block {
	public BlockSmoothQuartz() {
		super("smooth_quartz");
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