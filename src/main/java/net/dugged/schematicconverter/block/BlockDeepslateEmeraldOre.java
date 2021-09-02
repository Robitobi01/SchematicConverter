package net.dugged.schematicconverter.block;

public class BlockDeepslateEmeraldOre extends Block {
	public BlockDeepslateEmeraldOre() {
		super("deepslate_emerald_ore");
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