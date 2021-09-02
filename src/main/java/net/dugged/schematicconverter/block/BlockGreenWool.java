package net.dugged.schematicconverter.block;

public class BlockGreenWool extends Block {
	public BlockGreenWool() {
		super("green_wool");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteWool().setMetadata(13);
	}
}