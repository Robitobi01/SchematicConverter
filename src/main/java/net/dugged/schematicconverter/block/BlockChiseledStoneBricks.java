package net.dugged.schematicconverter.block;

public class BlockChiseledStoneBricks extends Block {
	public BlockChiseledStoneBricks() {
		super("chiseled_stone_bricks");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	public Block getOldBlock() {
		return new BlockStoneBricks().setMetadata(3);
	}

}