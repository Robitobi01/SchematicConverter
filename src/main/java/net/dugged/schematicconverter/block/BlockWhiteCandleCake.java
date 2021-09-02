package net.dugged.schematicconverter.block;

public class BlockWhiteCandleCake extends Block {
	protected static final BlockProperty lit = new BlockProperty("lit", new String[]{"false", "true"});

	public BlockWhiteCandleCake() {
		super("white_candle_cake");
		blockProperties.add(lit);
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