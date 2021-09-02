package net.dugged.schematicconverter.block;

public class BlockPottedWarpedRoots extends Block {
	public BlockPottedWarpedRoots() {
		super("potted_warped_roots");
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