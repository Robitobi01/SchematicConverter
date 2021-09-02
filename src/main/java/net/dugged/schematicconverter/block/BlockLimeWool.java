package net.dugged.schematicconverter.block;

public class BlockLimeWool extends Block {
	public BlockLimeWool() {
		super("lime_wool");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteWool().setMetadata(5);
	}
}