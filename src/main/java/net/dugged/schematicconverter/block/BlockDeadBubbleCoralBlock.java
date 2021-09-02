package net.dugged.schematicconverter.block;

public class BlockDeadBubbleCoralBlock extends Block {
	public BlockDeadBubbleCoralBlock() {
		super("dead_bubble_coral_block");
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