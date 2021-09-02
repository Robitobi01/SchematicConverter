package net.dugged.schematicconverter.block;

public class BlockPrismarineStairs extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "south", "west", "east"});
	protected static final BlockProperty half = new BlockProperty("half", new String[]{"top", "bottom"});
	protected static final BlockProperty shape = new BlockProperty("shape", new String[]{"straight", "inner_left", "inner_right", "outer_left", "outer_right"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockPrismarineStairs() {
		super("prismarine_stairs");
		blockProperties.add(facing);
		blockProperties.add(half);
		blockProperties.add(shape);
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