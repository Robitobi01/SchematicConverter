package net.dugged.schematicconverter.block;

public class BlockWarpedRoots extends Block {
	public BlockWarpedRoots() {
		super("warped_roots");
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