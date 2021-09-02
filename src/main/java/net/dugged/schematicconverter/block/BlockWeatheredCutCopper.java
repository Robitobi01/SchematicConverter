package net.dugged.schematicconverter.block;

public class BlockWeatheredCutCopper extends Block {
	public BlockWeatheredCutCopper() {
		super("weathered_cut_copper");
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