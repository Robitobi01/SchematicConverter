package net.dugged.schematicconverter.block;

public class BlockBlackCarpet extends Block {
	public BlockBlackCarpet() {
		super("black_carpet");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteCarpet().setMetadata(15);
	}
}