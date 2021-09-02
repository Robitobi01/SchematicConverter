package net.dugged.schematicconverter.block;

public class BlockWaxedExposedCutCopper extends Block {
	public BlockWaxedExposedCutCopper() {
		super("waxed_exposed_cut_copper");
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