package net.dugged.schematicconverter.block;

public class BlockDeepslateDiamondOre extends Block {
	public BlockDeepslateDiamondOre() {
		super("deepslate_diamond_ore");
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