package net.dugged.schematicconverter.block;

public class BlockWarpedNylium extends Block {
	public BlockWarpedNylium() {
		super("warped_nylium");
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