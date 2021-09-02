package net.dugged.schematicconverter.block;

public class BlockSmoothStoneSlab extends Block {
	protected static final BlockProperty type = new BlockProperty("type", new String[]{"bottom", "top", "double"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockSmoothStoneSlab() {
		super("smooth_stone_slab");
		setOldId(44);
		setOldName("stone_slab");
		type.setMetadataIndexBit(3);
		type.setMetadataBitCount(1);
		blockProperties.add(type);
		blockProperties.add(waterlogged);
	}

	@Override
	public Block getNewBlock() {
		int index = getMetaBits(type.getMetadataBitCount(), type.getMetadataIndexBit());
		Block block;
		switch (getMetaBits(3, 0)) {
			case 1:
				block = new BlockSandstoneSlab();
				return block.setProperty(BlockSandstoneSlab.type.getName(), block.getProperty(BlockSandstoneSlab.type.getName()).getPropertyByIndex(index));
			case 2:
				block = new BlockOakSlab();
				return block.setProperty(BlockOakSlab.type.getName(), block.getProperty(BlockOakSlab.type.getName()).getPropertyByIndex(index));
			case 3:
				block = new BlockCobblestoneSlab();
				return block.setProperty(BlockCobblestoneSlab.type.getName(), block.getProperty(BlockCobblestoneSlab.type.getName()).getPropertyByIndex(index));
			case 4:
				block = new BlockBrickSlab();
				return block.setProperty(BlockBrickSlab.type.getName(), block.getProperty(BlockBrickSlab.type.getName()).getPropertyByIndex(index));
			case 5:
				block = new BlockStoneBrickSlab();
				return block.setProperty(BlockStoneBrickSlab.type.getName(), block.getProperty(BlockStoneBrickSlab.type.getName()).getPropertyByIndex(index));
			case 6:
				block = new BlockNetherBrickSlab();
				return block.setProperty(BlockNetherBrickSlab.type.getName(), block.getProperty(BlockNetherBrickSlab.type.getName()).getPropertyByIndex(index));
			case 7:
				block = new BlockQuartzSlab();
				return block.setProperty(BlockQuartzSlab.type.getName(), block.getProperty(BlockQuartzSlab.type.getName()).getPropertyByIndex(index));
			default:
				return new BlockSmoothStoneSlab().setProperty(type.getName(), type.getPropertyByIndex(index));
		}
	}

	@Override
	public Block getOldBlock() {
		if (type.getValue().equals("double")) {
			return new BlockSmoothStoneDoubleSlab().setMetadata(getMetaBits(3, 0));
		} else {
			return new BlockSmoothStoneSlab().setMetadata(setMetaBits(type.getCurrentIndex(), 3));
		}
	}
}