package net.dugged.schematicconverter.block;

public class BlockWitherSkeletonWallSkull extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "south", "west", "east"});

	public BlockWitherSkeletonWallSkull() {
		super("wither_skeleton_wall_skull");
		blockProperties.add(facing);
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}