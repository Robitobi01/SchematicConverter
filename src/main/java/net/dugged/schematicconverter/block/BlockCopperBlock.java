package net.dugged.schematicconverter.block;

public class BlockCopperBlock extends Block {
	public BlockCopperBlock() {
		super("copper_block");
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