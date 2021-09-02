package net.dugged.schematicconverter.block;

public class BlockGlass extends Block {
	public BlockGlass() {
		super("glass");
		setOldId(20);
		setOldName("glass");
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