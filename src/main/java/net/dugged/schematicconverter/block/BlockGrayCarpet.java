package net.dugged.schematicconverter.block;

public class BlockGrayCarpet extends Block {
	public BlockGrayCarpet() {
		super("gray_carpet");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteCarpet().setMetadata(7);
	}
}