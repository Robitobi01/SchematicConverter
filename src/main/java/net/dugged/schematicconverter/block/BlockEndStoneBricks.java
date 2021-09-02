package net.dugged.schematicconverter.block;

public class BlockEndStoneBricks extends Block {
	public BlockEndStoneBricks() {
		super("end_stone_bricks");
		setOldId(206);
		setOldName("end_bricks");
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