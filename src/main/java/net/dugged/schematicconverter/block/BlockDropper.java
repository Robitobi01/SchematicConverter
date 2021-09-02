package net.dugged.schematicconverter.block;

public class BlockDropper extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"down", "up", "north", "south", "west", "east"});
	protected static final BlockProperty triggered = new BlockProperty("triggered", new String[]{"false", "true"});

	public BlockDropper() {
		super("dropper");
		setOldId(158);
		setOldName("dropper");
		facing.setMetadataIndexBit(0);
		facing.setMetadataBitCount(3);
		triggered.setMetadataBitCount(3);
		triggered.setMetadataBitCount(1);
		blockProperties.add(facing);
		blockProperties.add(triggered);
	}

	@Override
	public Block getNewBlock() {
		Block block = new BlockDispenser().setProperty(facing.getName(), facing.getPropertyByIndex(getMetaBits(facing.getMetadataBitCount(), facing.getMetadataIndexBit())));
		return block.setProperty(triggered.getName(), triggered.getPropertyByIndex(getMetaBits(triggered.getMetadataBitCount(), triggered.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		Block block = new BlockDispenser().setMetadata(setMetaBits(facing.getCurrentIndex(), facing.getMetadataIndexBit()));
		return block.setMetadata(block.setMetaBits(triggered.getCurrentIndex(), triggered.getMetadataIndexBit()));
	}
}