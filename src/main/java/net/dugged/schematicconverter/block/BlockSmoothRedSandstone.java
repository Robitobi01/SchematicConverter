package net.dugged.schematicconverter.block;

public class BlockSmoothRedSandstone extends Block {
	public BlockSmoothRedSandstone() {
		super("smooth_red_sandstone");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockRedSandstone().setMetadata(2);
	}
}