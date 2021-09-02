package net.dugged.schematicconverter.block;

public class BlockBrownStainedGlass extends Block {
	public BlockBrownStainedGlass() {
		super("brown_stained_glass");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteStainedGlass().setMetadata(12);
	}
}