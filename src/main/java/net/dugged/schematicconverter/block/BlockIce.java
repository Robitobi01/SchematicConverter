package net.dugged.schematicconverter.block;

public class BlockIce extends Block {
	public BlockIce() {
		super("ice");
		setOldId(79);
		setOldName("ice");
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