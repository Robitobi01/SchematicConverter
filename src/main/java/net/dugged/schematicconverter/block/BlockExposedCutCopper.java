package net.dugged.schematicconverter.block;

public class BlockExposedCutCopper extends Block {
	public BlockExposedCutCopper() {
		super("exposed_cut_copper");
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