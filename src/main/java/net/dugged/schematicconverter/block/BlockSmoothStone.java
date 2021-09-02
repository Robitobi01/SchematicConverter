package net.dugged.schematicconverter.block;

public class BlockSmoothStone extends Block {
	public BlockSmoothStone() {
		super("smooth_stone");
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