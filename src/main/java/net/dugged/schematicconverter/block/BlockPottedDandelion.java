package net.dugged.schematicconverter.block;

public class BlockPottedDandelion extends Block {
	public BlockPottedDandelion() {
		super("potted_dandelion");
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