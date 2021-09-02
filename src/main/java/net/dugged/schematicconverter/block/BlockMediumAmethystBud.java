package net.dugged.schematicconverter.block;

public class BlockMediumAmethystBud extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"down", "up", "north", "south", "west", "east"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockMediumAmethystBud() {
		super("medium_amethyst_bud");
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