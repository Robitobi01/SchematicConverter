package net.dugged.schematicconverter.block;

public class BlockGrayStainedGlass extends Block {
	public BlockGrayStainedGlass() {
		super("gray_stained_glass");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteStainedGlass().setMetadata(7);
	}
}