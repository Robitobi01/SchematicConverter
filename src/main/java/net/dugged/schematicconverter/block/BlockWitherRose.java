package net.dugged.schematicconverter.block;

public class BlockWitherRose extends Block {
	public BlockWitherRose() {
		super("wither_rose");
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