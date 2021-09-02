package net.dugged.schematicconverter.block;

public class BlockSkeletonSkull extends Block {
	protected static final BlockProperty rotation = new BlockProperty("rotation", new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"});

	public BlockSkeletonSkull() {
		super("skeleton_skull");
		setOldId(144);
		setOldName("skull");
		blockProperties.add(rotation);
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 2:
				return new BlockSkeletonWallSkull().setProperty(BlockSkeletonWallSkull.facing.getName(), "north");
			case 3:
				return new BlockSkeletonWallSkull().setProperty(BlockSkeletonWallSkull.facing.getName(), "south");
			case 4:
				return new BlockSkeletonWallSkull().setProperty(BlockSkeletonWallSkull.facing.getName(), "west");
			case 5:
				return new BlockSkeletonWallSkull().setProperty(BlockSkeletonWallSkull.facing.getName(), "east");
			default:
				return new BlockSkeletonSkull();
		}
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}