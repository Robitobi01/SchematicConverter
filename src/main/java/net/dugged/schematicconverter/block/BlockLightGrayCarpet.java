package net.dugged.schematicconverter.block;

public class BlockLightGrayCarpet extends Block {
	public BlockLightGrayCarpet() {
		super("light_gray_carpet");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteCarpet().setMetadata(8);
	}
}