package net.dugged.schematicconverter.block;

public class BlockSoulLantern extends Block {
	protected static final BlockProperty hanging = new BlockProperty("hanging", new String[]{"false", "true"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockSoulLantern() {
		super("soul_lantern");
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