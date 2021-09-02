package net.dugged.schematicconverter.block;

public class BlockRawGoldBlock extends Block {
	public BlockRawGoldBlock() {
		super("raw_gold_block");
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