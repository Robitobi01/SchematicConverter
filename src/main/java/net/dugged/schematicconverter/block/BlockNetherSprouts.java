package net.dugged.schematicconverter.block;

public class BlockNetherSprouts extends Block {
	public BlockNetherSprouts() {
		super("nether_sprouts");
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