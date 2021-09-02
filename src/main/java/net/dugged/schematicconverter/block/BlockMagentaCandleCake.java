package net.dugged.schematicconverter.block;

public class BlockMagentaCandleCake extends Block {
	protected static final BlockProperty lit = new BlockProperty("lit", new String[]{"false", "true"});

	public BlockMagentaCandleCake() {
		super("magenta_candle_cake");
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