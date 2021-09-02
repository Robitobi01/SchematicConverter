package net.dugged.schematicconverter.block;

public class BlockPottedDarkOakSapling extends Block {
	public BlockPottedDarkOakSapling() {
		super("potted_dark_oak_sapling");
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