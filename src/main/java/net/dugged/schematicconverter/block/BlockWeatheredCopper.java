package net.dugged.schematicconverter.block;

public class BlockWeatheredCopper extends Block {
	public BlockWeatheredCopper() {
		super("weathered_copper");
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