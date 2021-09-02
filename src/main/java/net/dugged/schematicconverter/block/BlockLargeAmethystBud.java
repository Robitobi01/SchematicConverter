package net.dugged.schematicconverter.block;

public class BlockLargeAmethystBud extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"down", "up", "north", "south", "west", "east"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockLargeAmethystBud() {
		super("large_amethyst_bud");
		blockProperties.add(facing);
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