package net.dugged.schematicconverter.block;

public class BlockWaxedCopperBlock extends Block {
	public BlockWaxedCopperBlock() {
		super("waxed_copper_block");
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