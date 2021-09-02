package net.dugged.schematicconverter.block;

public class BlockGrayCandle extends Block {
	protected static final BlockProperty candles = new BlockProperty("candles", new String[]{"1", "2", "3", "4"});
	protected static final BlockProperty lit = new BlockProperty("lit", new String[]{"false", "true"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockGrayCandle() {
		super("gray_candle");
		blockProperties.add(candles);
		blockProperties.add(lit);
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