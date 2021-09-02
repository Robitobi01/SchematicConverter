package net.dugged.schematicconverter.block;

public class BlockPistonHead extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"down", "up", "north", "south", "west", "east"});
	protected static final BlockProperty isShort = new BlockProperty("short", new String[]{"false", "true"});
	protected static final BlockProperty type = new BlockProperty("type", new String[]{"normal", "sticky"});

	public BlockPistonHead() {
		super("piston_head");
		setOldId(34);
		setOldName("piston_head");
		facing.setMetadataIndexBit(0);
		facing.setMetadataBitCount(3);
		type.setMetadataIndexBit(3);
		type.setMetadataBitCount(1);
		blockProperties.add(facing);
		blockProperties.add(isShort);
		blockProperties.add(type);
	}

	@Override
	public Block getNewBlock() {
		Block block = new BlockPistonHead().setProperty(facing.getName(), facing.getPropertyByIndex(getMetaBits(facing.getMetadataBitCount(), facing.getMetadataIndexBit())));
		return block.setProperty(type.getName(), type.getPropertyByIndex(getMetaBits(type.getMetadataBitCount(), type.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		Block block = new BlockPistonHead().setMetadata(setMetaBits(facing.getCurrentIndex(), facing.getMetadataIndexBit()));
		return block.setMetadata(block.setMetaBits(type.getCurrentIndex(), type.getMetadataIndexBit()));
	}
}