package net.dugged.schematicconverter.block;

public class BlockInfestedChiseledStoneBricks extends Block {
	public BlockInfestedChiseledStoneBricks() {
		super("infested_chiseled_stone_bricks");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockInfestedStoneBricks().setMetadata(5);
	}
}