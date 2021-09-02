package net.dugged.schematicconverter.block;

public class BlockDiamondOre extends Block {
	public BlockDiamondOre() {
		super("diamond_ore");
		setOldId(56);
		setOldName("diamond_ore");
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