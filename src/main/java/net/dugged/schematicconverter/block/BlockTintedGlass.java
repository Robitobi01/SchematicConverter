package net.dugged.schematicconverter.block;

public class BlockTintedGlass extends Block {
	public BlockTintedGlass() {
		super("tinted_glass");
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