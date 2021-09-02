package net.dugged.schematicconverter.block;

public class BlockCampfire extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "south", "west", "east"});
	protected static final BlockProperty lit = new BlockProperty("lit", new String[]{"false", "true"});
	protected static final BlockProperty signal_fire = new BlockProperty("signal_fire", new String[]{"false", "true"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockCampfire() {
		super("campfire");
		blockProperties.add(facing);
		blockProperties.add(lit);
		blockProperties.add(signal_fire);
		blockProperties.add(waterlogged);
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