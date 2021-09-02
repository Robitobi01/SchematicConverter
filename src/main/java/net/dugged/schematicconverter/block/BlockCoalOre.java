package net.dugged.schematicconverter.block;

public class BlockCoalOre extends Block {
	public BlockCoalOre() {
		super("coal_ore");
		setOldId(16);
		setOldName("coal_ore");
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