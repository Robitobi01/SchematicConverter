package net.dugged.schematicconverter.block;

public class BlockIronOre extends Block {
	public BlockIronOre() {
		super("iron_ore");
		setOldId(15);
		setOldName("iron_ore");
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