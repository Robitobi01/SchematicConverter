package net.dugged.schematicconverter.block;

public class BlockLapisOre extends Block {
	public BlockLapisOre() {
		super("lapis_ore");
		setOldId(21);
		setOldName("lapis_ore");
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