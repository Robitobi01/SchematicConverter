package net.dugged.schematicconverter.block;

public class BlockWarpedFungus extends Block {
	public BlockWarpedFungus() {
		super("warped_fungus");
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