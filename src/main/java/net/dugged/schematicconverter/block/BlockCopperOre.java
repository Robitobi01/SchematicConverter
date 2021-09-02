package net.dugged.schematicconverter.block;

public class BlockCopperOre extends Block {
	public BlockCopperOre() {
		super("copper_ore");
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