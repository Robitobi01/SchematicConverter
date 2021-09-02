package net.dugged.schematicconverter.block;

public class BlockPottedFern extends Block {
	public BlockPottedFern() {
		super("potted_fern");
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