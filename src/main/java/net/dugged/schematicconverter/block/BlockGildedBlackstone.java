package net.dugged.schematicconverter.block;

public class BlockGildedBlackstone extends Block {
	public BlockGildedBlackstone() {
		super("gilded_blackstone");
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