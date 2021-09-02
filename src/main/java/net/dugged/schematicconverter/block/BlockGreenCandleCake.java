package net.dugged.schematicconverter.block;

public class BlockGreenCandleCake extends Block {
	protected static final BlockProperty lit = new BlockProperty("lit", new String[]{"false", "true"});

	public BlockGreenCandleCake() {
		super("green_candle_cake");
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