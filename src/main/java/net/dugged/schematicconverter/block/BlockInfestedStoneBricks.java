package net.dugged.schematicconverter.block;

public class BlockInfestedStoneBricks extends Block {
	public BlockInfestedStoneBricks() {
		super("infested_stone_bricks");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockInfestedStoneBricks().setMetadata(2);
	}
}