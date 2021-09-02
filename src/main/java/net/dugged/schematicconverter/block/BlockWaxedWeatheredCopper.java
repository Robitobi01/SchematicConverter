package net.dugged.schematicconverter.block;

public class BlockWaxedWeatheredCopper extends Block {
	public BlockWaxedWeatheredCopper() {
		super("waxed_weathered_copper");
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