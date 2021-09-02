package net.dugged.schematicconverter.block;

public class BlockPinkShulkerBox extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"down", "up", "north", "south", "west", "east"});

	public BlockPinkShulkerBox() {
		super("pink_shulker_box");
		setOldId(225);
		setOldName("pink_shulker_box");
		facing.setMetadataIndexBit(0);
		facing.setMetadataBitCount(3);
		blockProperties.add(facing);
	}

	@Override
	public Block getNewBlock() {
		return new BlockPinkShulkerBox().setProperty(facing.getName(), facing.getPropertyByIndex(getMetaBits(facing.getMetadataBitCount(), facing.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		return new BlockPinkShulkerBox().setMetadata(setMetaBits(facing.getCurrentIndex(), facing.getMetadataIndexBit()));
	}
}