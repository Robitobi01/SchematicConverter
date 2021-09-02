package net.dugged.schematicconverter.block;

public class BlockObsidian extends Block {
	public BlockObsidian() {
		super("obsidian");
		setOldId(49);
		setOldName("obsidian");
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