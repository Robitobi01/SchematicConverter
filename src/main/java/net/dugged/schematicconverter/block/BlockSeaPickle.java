package net.dugged.schematicconverter.block;

public class BlockSeaPickle extends Block {
	protected static final BlockProperty pickles = new BlockProperty("pickles", new String[]{"1", "2", "3", "4"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockSeaPickle() {
		super("sea_pickle");
		blockProperties.add(pickles);
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