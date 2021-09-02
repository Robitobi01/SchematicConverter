package net.dugged.schematicconverter.block;

public class BlockBricks extends Block {
	public BlockBricks() {
		super("bricks");
		setOldId(45);
		setOldName("brick_block");
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