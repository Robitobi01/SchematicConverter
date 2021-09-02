package net.dugged.schematicconverter.block;

public class BlockWarpedPlanks extends Block {
	public BlockWarpedPlanks() {
		super("warped_planks");
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