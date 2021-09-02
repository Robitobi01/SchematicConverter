package net.dugged.schematicconverter.block;

public class BlockBlueIce extends Block {
	public BlockBlueIce() {
		super("blue_ice");
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