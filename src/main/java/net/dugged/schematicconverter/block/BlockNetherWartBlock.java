package net.dugged.schematicconverter.block;

public class BlockNetherWartBlock extends Block {
	public BlockNetherWartBlock() {
		super("nether_wart_block");
		setOldId(214);
		setOldName("nether_wart_block");
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