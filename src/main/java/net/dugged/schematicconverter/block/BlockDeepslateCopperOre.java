package net.dugged.schematicconverter.block;

public class BlockDeepslateCopperOre extends Block {
	public BlockDeepslateCopperOre() {
		super("deepslate_copper_ore");
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