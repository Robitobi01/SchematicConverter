package net.dugged.schematicconverter.block;

public class BlockPurpleStainedGlass extends Block {
	public BlockPurpleStainedGlass() {
		super("purple_stained_glass");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteStainedGlass().setMetadata(10);
	}
}