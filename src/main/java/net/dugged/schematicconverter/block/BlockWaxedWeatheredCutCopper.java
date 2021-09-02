package net.dugged.schematicconverter.block;

public class BlockWaxedWeatheredCutCopper extends Block {
	public BlockWaxedWeatheredCutCopper() {
		super("waxed_weathered_cut_copper");
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