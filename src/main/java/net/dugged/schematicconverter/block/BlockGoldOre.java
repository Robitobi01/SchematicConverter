package net.dugged.schematicconverter.block;

public class BlockGoldOre extends Block {
	public BlockGoldOre() {
		super("gold_ore");
		setOldId(14);
		setOldName("gold_ore");
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