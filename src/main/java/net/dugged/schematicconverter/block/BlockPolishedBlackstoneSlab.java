package net.dugged.schematicconverter.block;

public class BlockPolishedBlackstoneSlab extends Block {
	protected static final BlockProperty type = new BlockProperty("type", new String[]{"bottom", "top", "double"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockPolishedBlackstoneSlab() {
		super("polished_blackstone_slab");
		blockProperties.add(type);
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