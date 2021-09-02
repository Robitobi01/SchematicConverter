package net.dugged.schematicconverter.block;

public class BlockTrappedChest extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "south", "west", "east"});
	protected static final BlockProperty type = new BlockProperty("type", new String[]{"single", "left", "right"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockTrappedChest() {
		super("trapped_chest");
		setOldId(146);
		setOldName("trapped_chest");
		facing.setMetadataIndexBit(0);
		facing.setMetadataBitCount(3);
		blockProperties.add(facing);
		blockProperties.add(type);
		blockProperties.add(waterlogged);
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 3:
				return new BlockTrappedChest().setProperty(facing.getName(), "south");
			case 4:
				return new BlockTrappedChest().setProperty(facing.getName(), "west");
			case 5:
				return new BlockTrappedChest().setProperty(facing.getName(), "east");
			default:
				return new BlockTrappedChest().setProperty(facing.getName(), "north");
		}
	}

	@Override
	public Block getOldBlock() {
		switch (facing.getValue()) {
			case "south":
				return new BlockTrappedChest().setMetadata(3);
			case "west":
				return new BlockTrappedChest().setMetadata(4);
			case "east":
				return new BlockTrappedChest().setMetadata(5);
			default:
				return new BlockTrappedChest().setMetadata(2);
		}
	}
}