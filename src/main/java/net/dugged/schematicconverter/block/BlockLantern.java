package net.dugged.schematicconverter.block;

public class BlockLantern extends Block {
	protected static final BlockProperty hanging = new BlockProperty("hanging", new String[]{"false", "true"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockLantern() {
		super("lantern");
		blockProperties.add(hanging);
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