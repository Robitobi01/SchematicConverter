package net.dugged.schematicconverter.block;

public class BlockDeepslateIronOre extends Block {
	public BlockDeepslateIronOre() {
		super("deepslate_iron_ore");
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