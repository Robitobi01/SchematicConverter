package net.dugged.schematicconverter.block;

public class BlockRedShulkerBox extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"down", "up", "north", "south", "west", "east"});

	public BlockRedShulkerBox() {
		super("red_shulker_box");
		setOldId(233);
		setOldName("red_shulker_box");
		facing.setMetadataIndexBit(0);
		facing.setMetadataBitCount(3);
		blockProperties.add(facing);
	}

	@Override
	public Block getNewBlock() {
		return new BlockRedShulkerBox().setProperty(facing.getName(), facing.getPropertyByIndex(getMetaBits(facing.getMetadataBitCount(), facing.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		return new BlockRedShulkerBox().setMetadata(setMetaBits(facing.getCurrentIndex(), facing.getMetadataIndexBit()));
	}
}