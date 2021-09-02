package net.dugged.schematicconverter.block;

public class BlockShroomlight extends Block {
	public BlockShroomlight() {
		super("shroomlight");
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