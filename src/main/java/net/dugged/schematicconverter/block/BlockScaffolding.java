package net.dugged.schematicconverter.block;

public class BlockScaffolding extends Block {
	protected static final BlockProperty bottom = new BlockProperty("bottom", new String[]{"false", "true"});
	protected static final BlockProperty distance = new BlockProperty("distance", new String[]{"0", "1", "2", "3", "4", "5", "6", "7"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockScaffolding() {
		super("scaffolding");
		blockProperties.add(bottom);
		blockProperties.add(distance);
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