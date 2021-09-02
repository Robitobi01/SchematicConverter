package net.dugged.schematicconverter.block;

public class BlockJigsaw extends Block {
	protected static final BlockProperty orientation = new BlockProperty("orientation", new String[]{"down_east", "down_north", "down_south", "down_west", "up_east", "up_north", "up_south", "up_west", "west_up", "east_up", "north_up", "south_up"});

	public BlockJigsaw() {
		super("jigsaw");
		blockProperties.add(orientation);
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