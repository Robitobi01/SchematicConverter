package net.dugged.schematicconverter.block;

public class BlockCrackedNetherBricks extends Block {
	public BlockCrackedNetherBricks() {
		super("cracked_nether_bricks");
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