package net.dugged.schematicconverter.block;

public class BlockLimeStainedGlass extends Block {
	public BlockLimeStainedGlass() {
		super("lime_stained_glass");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteStainedGlass().setMetadata(5);
	}
}