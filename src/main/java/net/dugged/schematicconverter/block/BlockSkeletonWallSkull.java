package net.dugged.schematicconverter.block;

public class BlockSkeletonWallSkull extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "south", "west", "east"});

	public BlockSkeletonWallSkull() {
		super("skeleton_wall_skull");
		blockProperties.add(facing);
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		switch (facing.getValue()) {
			case "south":
				return new BlockSkeletonSkull().setMetadata(3);
			case "west":
				return new BlockSkeletonSkull().setMetadata(4);
			case "east":
				return new BlockSkeletonSkull().setMetadata(5);
			default:
				return new BlockSkeletonSkull().setMetadata(2);

		}
	}
}