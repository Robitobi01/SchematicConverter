package net.dugged.schematicconverter.block;

public class BlockDeepslateCoalOre extends Block {
	public BlockDeepslateCoalOre() {
		super("deepslate_coal_ore");
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