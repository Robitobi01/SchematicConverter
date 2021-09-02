package net.dugged.schematicconverter.block;

public class BlockYellowWallBanner extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "south", "west", "east"});

	public BlockYellowWallBanner() {
		super("yellow_wall_banner");
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