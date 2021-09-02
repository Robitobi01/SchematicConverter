package net.dugged.schematicconverter.block;

public class BlockClay extends Block {
	public BlockClay() {
		super("clay");
		setOldId(82);
		setOldName("clay");
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