package net.dugged.schematicconverter.block;

public class BlockCrackedStoneBricks extends Block {
	public BlockCrackedStoneBricks() {
		super("cracked_stone_bricks");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockStoneBricks().setMetadata(2);
	}
}