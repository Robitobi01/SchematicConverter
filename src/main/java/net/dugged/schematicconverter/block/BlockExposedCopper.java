package net.dugged.schematicconverter.block;

public class BlockExposedCopper extends Block {
	public BlockExposedCopper() {
		super("exposed_copper");
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