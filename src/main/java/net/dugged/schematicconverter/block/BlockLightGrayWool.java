package net.dugged.schematicconverter.block;

public class BlockLightGrayWool extends Block {
	public BlockLightGrayWool() {
		super("light_gray_wool");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteWool().setMetadata(8);
	}
}