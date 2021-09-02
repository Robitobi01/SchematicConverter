package net.dugged.schematicconverter.block;

public class BlockDeepslateGoldOre extends Block {
	public BlockDeepslateGoldOre() {
		super("deepslate_gold_ore");
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