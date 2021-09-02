package net.dugged.schematicconverter.block;

public class BlockRawCopperBlock extends Block {
	public BlockRawCopperBlock() {
		super("raw_copper_block");
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