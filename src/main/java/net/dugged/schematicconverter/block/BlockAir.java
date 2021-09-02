package net.dugged.schematicconverter.block;

public class BlockAir extends Block {
	public BlockAir() {
		super("air");
		setOldId(0);
		setOldName("air");
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