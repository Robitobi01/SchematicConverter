package net.dugged.schematicconverter.block;

public class BlockCrackedPolishedBlackstoneBricks extends Block {
	public BlockCrackedPolishedBlackstoneBricks() {
		super("cracked_polished_blackstone_bricks");
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