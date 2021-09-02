package net.dugged.schematicconverter.block;

public class BlockPurpleShulkerBox extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"down", "up", "north", "south", "west", "east"});

	public BlockPurpleShulkerBox() {
		super("purple_shulker_box");
		setOldId(229);
		setOldName("purple_shulker_box");
		facing.setMetadataIndexBit(0);
		facing.setMetadataBitCount(3);
		blockProperties.add(facing);
	}

	@Override
	public Block getNewBlock() {
		return new BlockPurpleShulkerBox().setProperty(facing.getName(), facing.getPropertyByIndex(getMetaBits(facing.getMetadataBitCount(), facing.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		return new BlockPurpleShulkerBox().setMetadata(setMetaBits(facing.getCurrentIndex(), facing.getMetadataIndexBit()));
	}
}