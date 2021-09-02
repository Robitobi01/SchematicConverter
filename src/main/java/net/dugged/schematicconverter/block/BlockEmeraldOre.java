package net.dugged.schematicconverter.block;

public class BlockEmeraldOre extends Block {
	public BlockEmeraldOre() {
		super("emerald_ore");
		setOldId(129);
		setOldName("emerald_ore");
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