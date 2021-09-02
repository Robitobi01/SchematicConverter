package net.dugged.schematicconverter.block;

public class BlockPottedCornflower extends Block {
	public BlockPottedCornflower() {
		super("potted_cornflower");
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