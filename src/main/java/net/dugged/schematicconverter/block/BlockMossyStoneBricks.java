package net.dugged.schematicconverter.block;

public class BlockMossyStoneBricks extends Block {
	public BlockMossyStoneBricks() {
		super("mossy_stone_bricks");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockStoneBricks().setMetadata(1);
	}
}