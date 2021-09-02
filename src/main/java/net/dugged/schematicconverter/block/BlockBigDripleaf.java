package net.dugged.schematicconverter.block;

public class BlockBigDripleaf extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "south", "west", "east"});
	protected static final BlockProperty tilt = new BlockProperty("tilt", new String[]{"none", "unstable", "partial", "full"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockBigDripleaf() {
		super("big_dripleaf");
		blockProperties.add(facing);
		blockProperties.add(tilt);
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