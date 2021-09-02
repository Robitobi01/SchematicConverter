package net.dugged.schematicconverter.block;

public class BlockDeepslateLapisOre extends Block {
	public BlockDeepslateLapisOre() {
		super("deepslate_lapis_ore");
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