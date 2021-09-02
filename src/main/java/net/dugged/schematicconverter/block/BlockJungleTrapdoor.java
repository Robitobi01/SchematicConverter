package net.dugged.schematicconverter.block;

public class BlockJungleTrapdoor extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "south", "west", "east"});
	protected static final BlockProperty half = new BlockProperty("half", new String[]{"top", "bottom"});
	protected static final BlockProperty open = new BlockProperty("open", new String[]{"false", "true"});
	protected static final BlockProperty powered = new BlockProperty("powered", new String[]{"false", "true"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockJungleTrapdoor() {
		super("jungle_trapdoor");
		blockProperties.add(facing);
		blockProperties.add(half);
		blockProperties.add(open);
		blockProperties.add(powered);
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