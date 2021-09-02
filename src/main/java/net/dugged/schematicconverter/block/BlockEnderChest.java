package net.dugged.schematicconverter.block;

public class BlockEnderChest extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "south", "west", "east"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockEnderChest() {
		super("ender_chest");
		setOldId(130);
		setOldName("ender_chest");
		facing.setMetadataIndexBit(0);
		facing.setMetadataBitCount(3);
		blockProperties.add(facing);
		blockProperties.add(waterlogged);
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 3:
				return new BlockEnderChest().setProperty(facing.getName(), "south");
			case 4:
				return new BlockEnderChest().setProperty(facing.getName(), "west");
			case 5:
				return new BlockEnderChest().setProperty(facing.getName(), "east");
			default:
				return new BlockEnderChest().setProperty(facing.getName(), "north");
		}
	}

	@Override
	public Block getOldBlock() {
		switch (facing.getValue()) {
			case "south":
				return new BlockEnderChest().setMetadata(3);
			case "west":
				return new BlockEnderChest().setMetadata(4);
			case "east":
				return new BlockEnderChest().setMetadata(5);
			default:
				return new BlockEnderChest().setMetadata(2);
		}
	}
}