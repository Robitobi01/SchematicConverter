package net.dugged.schematicconverter.block;

public class BlockPottedOakSapling extends Block {
	public BlockPottedOakSapling() {
		super("potted_oak_sapling");
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