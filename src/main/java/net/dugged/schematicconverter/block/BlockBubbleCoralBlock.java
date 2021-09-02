package net.dugged.schematicconverter.block;

public class BlockBubbleCoralBlock extends Block {
	public BlockBubbleCoralBlock() {
		super("bubble_coral_block");
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