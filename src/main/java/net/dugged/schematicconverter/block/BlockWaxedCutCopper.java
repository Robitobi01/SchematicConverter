package net.dugged.schematicconverter.block;

public class BlockWaxedCutCopper extends Block {
	public BlockWaxedCutCopper() {
		super("waxed_cut_copper");
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