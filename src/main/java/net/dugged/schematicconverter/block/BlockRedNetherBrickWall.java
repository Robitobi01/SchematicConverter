package net.dugged.schematicconverter.block;

public class BlockRedNetherBrickWall extends Block {
	protected static final BlockProperty east = new BlockProperty("east", new String[]{"none", "low", "tall"});
	protected static final BlockProperty north = new BlockProperty("north", new String[]{"none", "low", "tall"});
	protected static final BlockProperty south = new BlockProperty("south", new String[]{"none", "low", "tall"});
	protected static final BlockProperty up = new BlockProperty("up", new String[]{"false", "true"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});
	protected static final BlockProperty west = new BlockProperty("west", new String[]{"none", "low", "tall"});

	public BlockRedNetherBrickWall() {
		super("red_nether_brick_wall");
		blockProperties.add(east);
		blockProperties.add(north);
		blockProperties.add(south);
		blockProperties.add(up);
		blockProperties.add(waterlogged);
		blockProperties.add(west);
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