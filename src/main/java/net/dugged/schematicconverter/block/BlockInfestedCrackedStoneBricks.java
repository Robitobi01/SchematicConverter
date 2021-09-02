package net.dugged.schematicconverter.block;

public class BlockInfestedCrackedStoneBricks extends Block {
	public BlockInfestedCrackedStoneBricks() {
		super("infested_cracked_stone_bricks");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockInfestedStoneBricks().setMetadata(4);
	}
}