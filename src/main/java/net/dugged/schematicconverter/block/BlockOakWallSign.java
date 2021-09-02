package net.dugged.schematicconverter.block;

public class BlockOakWallSign extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "south", "west", "east"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockOakWallSign() {
		super("oak_wall_sign");
		setOldId(68);
		setOldName("wall_sign");
		facing.setMetadataIndexBit(0);
		facing.setMetadataBitCount(3);
		blockProperties.add(facing);
		blockProperties.add(waterlogged);
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 3:
				return new BlockOakWallSign().setProperty(facing.getName(), "south");
			case 4:
				return new BlockOakWallSign().setProperty(facing.getName(), "west");
			case 5:
				return new BlockOakWallSign().setProperty(facing.getName(), "east");
			default:
				return new BlockOakWallSign().setProperty(facing.getName(), "north");
		}
	}

	@Override
	public Block getOldBlock() {
		switch (facing.getValue()) {
			case "south":
				return new BlockOakWallSign().setMetadata(3);
			case "west":
				return new BlockOakWallSign().setMetadata(4);
			case "east":
				return new BlockOakWallSign().setMetadata(5);
			default:
				return new BlockOakWallSign().setMetadata(2);
		}
	}
}