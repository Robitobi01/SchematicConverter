package net.dugged.schematicconverter.block;

public class BlockObserver extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"down", "up", "north", "south", "west", "east"});
	protected static final BlockProperty powered = new BlockProperty("powered", new String[]{"false", "true"});

	public BlockObserver() {
		super("observer");
		setOldId(218);
		setOldName("observer");
		powered.setMetadataIndexBit(3);
		powered.setMetadataBitCount(1);
		facing.setMetadataIndexBit(0);
		facing.setMetadataBitCount(3);
		blockProperties.add(facing);
		blockProperties.add(powered);
	}

	@Override
	public Block getNewBlock() {
		Block block = new BlockObserver().setProperty(facing.getName(), facing.getPropertyByIndex(getMetaBits(facing.getMetadataBitCount(), facing.getMetadataIndexBit())));
		return block.setProperty(powered.getName(), powered.getPropertyByIndex(getMetaBits(powered.getMetadataBitCount(), powered.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		Block block = new BlockObserver().setMetadata(setMetaBits(facing.getCurrentIndex(), facing.getMetadataIndexBit()));
		return block.setMetadata(block.setMetaBits(powered.getCurrentIndex(), powered.getMetadataIndexBit()));
	}
}