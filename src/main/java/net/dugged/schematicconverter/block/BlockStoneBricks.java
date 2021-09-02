package net.dugged.schematicconverter.block;

public class BlockStoneBricks extends Block {
	public BlockStoneBricks() {
		super("stone_bricks");
		setOldId(98);
		setOldName("stonebricks");
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 1:
				return new BlockMossyStoneBricks();
			case 2:
				return new BlockCrackedStoneBricks();
			case 3:
				return new BlockChiseledStoneBricks();
			default:
				return new BlockStoneBricks();
		}
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}