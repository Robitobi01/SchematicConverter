package net.dugged.schematicconverter.block;

public class BlockCyanCarpet extends Block {
	public BlockCyanCarpet() {
		super("cyan_carpet");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteCarpet().setMetadata(9);
	}
}