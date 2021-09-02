package net.dugged.schematicconverter.block;

public class BlockOakSlab extends Block {
	protected static final BlockProperty type = new BlockProperty("type", new String[]{"bottom", "top", "double"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockOakSlab() {
		super("oak_slab");
		setOldId(126);
		setOldName("wooden_slab");
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
				block = new BlockSpruceSlab();
				return block.setProperty(BlockSpruceSlab.type.getName(), block.getProperty(BlockSpruceSlab.type.getName()).getPropertyByIndex(index));
			case 2:
				block = new BlockBirchSlab();
				return block.setProperty(BlockBirchSlab.type.getName(), block.getProperty(BlockBirchSlab.type.getName()).getPropertyByIndex(index));
			case 3:
				block = new BlockJungleSlab();
				return block.setProperty(BlockJungleSlab.type.getName(), block.getProperty(BlockJungleSlab.type.getName()).getPropertyByIndex(index));
			case 4:
				block = new BlockAcaciaSlab();
				return block.setProperty(BlockAcaciaSlab.type.getName(), block.getProperty(BlockAcaciaSlab.type.getName()).getPropertyByIndex(index));
			case 5:
				block = new BlockDarkOakSlab();
				return block.setProperty(BlockDarkOakSlab.type.getName(), block.getProperty(BlockDarkOakSlab.type.getName()).getPropertyByIndex(index));
			default:
				return new BlockOakSlab().setProperty(type.getName(), type.getPropertyByIndex(index));
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