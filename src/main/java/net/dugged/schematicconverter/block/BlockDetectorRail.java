package net.dugged.schematicconverter.block;

public class BlockDetectorRail extends Block {
	protected static final BlockProperty powered = new BlockProperty("powered", new String[]{"false", "true"});
	protected static final BlockProperty shape = new BlockProperty("shape", new String[]{"north_south", "east_west", "ascending_east", "ascending_west", "ascending_north", "ascending_south"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockDetectorRail() {
		super("detector_rail");
		setOldId(28);
		setOldName("detector_rail");
		blockProperties.add(powered);
		blockProperties.add(shape);
		blockProperties.add(waterlogged);
	}

	@Override
	public Block getNewBlock() {
		Block block = new BlockPoweredRail().setProperty(powered.getName(), powered.getPropertyByIndex(getMetaBits(powered.getMetadataBitCount(), powered.getMetadataIndexBit())));
		return block.setProperty(shape.getName(), shape.getPropertyByIndex(getMetaBits(shape.getMetadataBitCount(), shape.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		Block block = new BlockPoweredRail().setMetadata(setMetaBits(powered.getCurrentIndex(), powered.getMetadataIndexBit()));
		return block.setMetadata(block.setMetaBits(shape.getCurrentIndex(), shape.getMetadataIndexBit()));
	}
}