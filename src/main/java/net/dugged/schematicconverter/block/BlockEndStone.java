package net.dugged.schematicconverter.block;

public class BlockEndStone extends Block {
	public BlockEndStone() {
		super("end_stone");
		setOldId(121);
		setOldName("end_stone");
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