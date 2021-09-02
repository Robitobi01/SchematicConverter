package net.dugged.schematicconverter.block;

public class BlockPottedBirchSapling extends Block {
	public BlockPottedBirchSapling() {
		super("potted_birch_sapling");
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