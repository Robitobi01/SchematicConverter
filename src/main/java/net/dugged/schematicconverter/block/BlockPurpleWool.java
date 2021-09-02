package net.dugged.schematicconverter.block;

public class BlockPurpleWool extends Block {
	public BlockPurpleWool() {
		super("purple_wool");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteWool().setMetadata(10);
	}
}