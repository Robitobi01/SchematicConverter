package net.dugged.schematicconverter.block;

public class BlockGreenCarpet extends Block {
	public BlockGreenCarpet() {
		super("green_carpet");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteCarpet().setMetadata(13);
	}
}