package net.dugged.schematicconverter.block;

public class BlockPolishedBlackstoneBricks extends Block {
	public BlockPolishedBlackstoneBricks() {
		super("polished_blackstone_bricks");
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