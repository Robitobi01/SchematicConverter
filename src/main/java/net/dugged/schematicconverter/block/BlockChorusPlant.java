package net.dugged.schematicconverter.block;

public class BlockChorusPlant extends Block {
	protected static final BlockProperty down = new BlockProperty("down", new String[]{"false", "true"});
	protected static final BlockProperty east = new BlockProperty("east", new String[]{"false", "true"});
	protected static final BlockProperty north = new BlockProperty("north", new String[]{"false", "true"});
	protected static final BlockProperty south = new BlockProperty("south", new String[]{"false", "true"});
	protected static final BlockProperty up = new BlockProperty("up", new String[]{"false", "true"});
	protected static final BlockProperty west = new BlockProperty("west", new String[]{"false", "true"});

	public BlockChorusPlant() {
		super("chorus_plant");
		setOldId(199);
		setOldName("chorus_plant");
		blockProperties.add(down);
		blockProperties.add(east);
		blockProperties.add(north);
		blockProperties.add(south);
		blockProperties.add(up);
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