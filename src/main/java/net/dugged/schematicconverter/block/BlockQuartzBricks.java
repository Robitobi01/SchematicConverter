package net.dugged.schematicconverter.block;

public class BlockQuartzBricks extends Block {
	public BlockQuartzBricks() {
		super("quartz_bricks");
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