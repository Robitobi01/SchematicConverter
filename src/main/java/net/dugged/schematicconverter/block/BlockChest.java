package net.dugged.schematicconverter.block;

public class BlockChest extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "south", "west", "east"});
	protected static final BlockProperty type = new BlockProperty("type", new String[]{"single", "left", "right"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockChest() {
		super("chest");
		setOldId(54);
		setOldName("chest");
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
				return new BlockChest().setProperty(facing.getName(), "south");
			case 4:
				return new BlockChest().setProperty(facing.getName(), "west");
			case 5:
				return new BlockChest().setProperty(facing.getName(), "east");
			default:
				return new BlockChest().setProperty(facing.getName(), "north");
		}
	}

	@Override
	public Block getOldBlock() {
		switch (facing.getValue()) {
			case "south":
				return new BlockChest().setMetadata(3);
			case "west":
				return new BlockChest().setMetadata(4);
			case "east":
				return new BlockChest().setMetadata(5);
			default:
				return new BlockChest().setMetadata(2);
		}
	}
}