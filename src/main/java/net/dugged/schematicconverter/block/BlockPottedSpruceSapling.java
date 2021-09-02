package net.dugged.schematicconverter.block;

public class BlockPottedSpruceSapling extends Block {
	public BlockPottedSpruceSapling() {
		super("potted_spruce_sapling");
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