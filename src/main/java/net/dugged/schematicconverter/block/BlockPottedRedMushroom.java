package net.dugged.schematicconverter.block;

public class BlockPottedRedMushroom extends Block {
	public BlockPottedRedMushroom() {
		super("potted_red_mushroom");
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