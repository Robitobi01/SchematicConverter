package net.dugged.schematicconverter.block;

public class BlockRail extends Block {
	protected static final BlockProperty shape = new BlockProperty("shape", new String[]{"north_south", "east_west", "ascending_east", "ascending_west", "ascending_north", "ascending_south", "south_east", "south_west", "north_west", "north_east"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockRail() {
		super("rail");
		setOldId(66);
		setOldName("rail");
		shape.setMetadataBitCount(4);
		shape.setMetadataBitCount(0);
		blockProperties.add(shape);
		blockProperties.add(waterlogged);
	}

	@Override
	public Block getNewBlock() {
		return new BlockRail().setProperty(shape.getName(), shape.getPropertyByIndex(getMetaBits(shape.getMetadataBitCount(), shape.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		return new BlockRail().setMetadata(setMetaBits(shape.getCurrentIndex(), shape.getMetadataIndexBit()));
	}
}