package net.dugged.schematicconverter.block;

public class BlockPottedBrownMushroom extends Block {
	public BlockPottedBrownMushroom() {
		super("potted_brown_mushroom");
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