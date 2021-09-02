package net.dugged.schematicconverter.block;

public class BlockGrayWool extends Block {
	public BlockGrayWool() {
		super("gray_wool");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteWool().setMetadata(7);
	}
}