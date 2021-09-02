package net.dugged.schematicconverter.block;

public class BlockLightBlueStainedGlass extends Block {
	public BlockLightBlueStainedGlass() {
		super("light_blue_stained_glass");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteStainedGlass().setMetadata(3);
	}
}