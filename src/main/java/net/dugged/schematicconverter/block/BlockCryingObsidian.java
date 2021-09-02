package net.dugged.schematicconverter.block;

public class BlockCryingObsidian extends Block {
	public BlockCryingObsidian() {
		super("crying_obsidian");
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