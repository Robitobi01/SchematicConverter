package net.dugged.schematicconverter.block;

public class BlockWaxedOxidizedCutCopper extends Block {
	public BlockWaxedOxidizedCutCopper() {
		super("waxed_oxidized_cut_copper");
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