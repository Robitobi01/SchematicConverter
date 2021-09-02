package net.dugged.schematicconverter.block;

public class BlockNetherGoldOre extends Block {
	public BlockNetherGoldOre() {
		super("nether_gold_ore");
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