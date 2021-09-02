package net.dugged.schematicconverter.block;

public class BlockSmoothSandstone extends Block {
	public BlockSmoothSandstone() {
		super("smooth_sandstone");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockSandstone().setMetadata(2);
	}
}