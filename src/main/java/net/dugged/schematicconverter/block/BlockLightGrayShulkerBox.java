package net.dugged.schematicconverter.block;

public class BlockLightGrayShulkerBox extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"down", "up", "north", "south", "west", "east"});

	public BlockLightGrayShulkerBox() {
		super("light_gray_shulker_box");
		setOldId(227);
		setOldName("light_gray_shulker_box");
		facing.setMetadataIndexBit(0);
		facing.setMetadataBitCount(3);
		blockProperties.add(facing);
	}

	@Override
	public Block getNewBlock() {
		return new BlockLightGrayShulkerBox().setProperty(facing.getName(), facing.getPropertyByIndex(getMetaBits(facing.getMetadataBitCount(), facing.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		return new BlockLightGrayShulkerBox().setMetadata(setMetaBits(facing.getCurrentIndex(), facing.getMetadataIndexBit()));
	}
}