package net.dugged.schematicconverter.block;

public class BlockLightBlueCarpet extends Block {
	public BlockLightBlueCarpet() {
		super("light_blue_carpet");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteCarpet().setMetadata(3);
	}
}