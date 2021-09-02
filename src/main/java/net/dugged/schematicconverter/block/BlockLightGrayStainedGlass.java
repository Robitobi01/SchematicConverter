package net.dugged.schematicconverter.block;

public class BlockLightGrayStainedGlass extends Block {
	public BlockLightGrayStainedGlass() {
		super("light_gray_stained_glass");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteStainedGlass().setMetadata(8);
	}
}