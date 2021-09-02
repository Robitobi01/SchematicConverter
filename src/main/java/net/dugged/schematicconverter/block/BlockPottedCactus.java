package net.dugged.schematicconverter.block;

public class BlockPottedCactus extends Block {
	public BlockPottedCactus() {
		super("potted_cactus");
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