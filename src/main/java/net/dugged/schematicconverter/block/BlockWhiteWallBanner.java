package net.dugged.schematicconverter.block;

public class BlockWhiteWallBanner extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "south", "west", "east"});

	public BlockWhiteWallBanner() {
		super("white_wall_banner");
		setOldId(177);
		setOldName("wall_banner");
		blockProperties.add(facing);
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 3:
				return new BlockWhiteWallBanner().setProperty(facing.getName(), "south");
			case 4:
				return new BlockWhiteWallBanner().setProperty(facing.getName(), "west");
			case 5:
				return new BlockWhiteWallBanner().setProperty(facing.getName(), "east");
			default:
				return new BlockWhiteWallBanner().setProperty(facing.getName(), "north");
		}
	}

	@Override
	public Block getOldBlock() {
		switch (facing.getValue()) {
			case "south":
				return new BlockWhiteWallBanner().setMetadata(3);
			case "west":
				return new BlockWhiteWallBanner().setMetadata(4);
			case "east":
				return new BlockWhiteWallBanner().setMetadata(5);
			default:
				return new BlockWhiteWallBanner().setMetadata(2);
		}
	}
}