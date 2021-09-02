package net.dugged.schematicconverter.block;

public class BlockWaxedExposedCopper extends Block {
	public BlockWaxedExposedCopper() {
		super("waxed_exposed_copper");
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