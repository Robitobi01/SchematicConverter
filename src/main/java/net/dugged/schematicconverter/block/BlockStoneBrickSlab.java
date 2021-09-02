package net.dugged.schematicconverter.block;

public class BlockStoneBrickSlab extends Block {
	protected static final BlockProperty type = new BlockProperty("type", new String[]{"bottom", "top", "double"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockStoneBrickSlab() {
		super("stone_brick_slab");
		type.setMetadataIndexBit(3);
		type.setMetadataBitCount(1);
		blockProperties.add(type);
		blockProperties.add(waterlogged);
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		if (type.getValue().equals("double")) {
			return new BlockSmoothStoneDoubleSlab().setMetadata(5);
		} else {
			return new BlockSmoothStoneSlab().setMetadata(setMetaBits(5, type.getCurrentIndex(), 3));
		}
	}
}