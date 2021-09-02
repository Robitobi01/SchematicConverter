package net.dugged.schematicconverter.block;

public class BlockGreenStainedGlass extends Block {
	public BlockGreenStainedGlass() {
		super("green_stained_glass");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteStainedGlass().setMetadata(13);
	}
}