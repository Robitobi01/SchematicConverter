package net.dugged.schematicconverter.block;

public class BlockPottedWarpedFungus extends Block {
	public BlockPottedWarpedFungus() {
		super("potted_warped_fungus");
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