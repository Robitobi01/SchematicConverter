package net.dugged.schematicconverter.block;

public class BlockChiseledNetherBricks extends Block {
	public BlockChiseledNetherBricks() {
		super("chiseled_nether_bricks");
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