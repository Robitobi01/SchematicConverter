package net.dugged.schematicconverter.block;

public class BlockLimeCarpet extends Block {
	public BlockLimeCarpet() {
		super("lime_carpet");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteCarpet().setMetadata(5);
	}
}