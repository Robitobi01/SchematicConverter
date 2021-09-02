package net.dugged.schematicconverter.block;

public class BlockBlueStainedGlass extends Block {
	public BlockBlueStainedGlass() {
		super("blue_stained_glass");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteStainedGlass().setMetadata(11);
	}
}