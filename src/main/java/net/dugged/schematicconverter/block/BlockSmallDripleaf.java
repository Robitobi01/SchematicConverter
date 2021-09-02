package net.dugged.schematicconverter.block;

public class BlockSmallDripleaf extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "south", "west", "east"});
	protected static final BlockProperty half = new BlockProperty("half", new String[]{"upper", "lower"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockSmallDripleaf() {
		super("small_dripleaf");
		blockProperties.add(facing);
		blockProperties.add(half);
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