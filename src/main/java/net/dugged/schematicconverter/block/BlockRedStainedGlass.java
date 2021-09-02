package net.dugged.schematicconverter.block;

public class BlockRedStainedGlass extends Block {
	public BlockRedStainedGlass() {
		super("red_stained_glass");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteStainedGlass().setMetadata(14);
	}
}