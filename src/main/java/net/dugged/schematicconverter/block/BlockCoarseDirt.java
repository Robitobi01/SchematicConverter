package net.dugged.schematicconverter.block;

public class BlockCoarseDirt extends Block {
	public BlockCoarseDirt() {
		super("coarse_dirt");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockDirt().setMetadata(1);
	}
}