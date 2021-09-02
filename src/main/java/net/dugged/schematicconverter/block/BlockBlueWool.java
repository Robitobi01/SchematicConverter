package net.dugged.schematicconverter.block;

public class BlockBlueWool extends Block {
	public BlockBlueWool() {
		super("blue_wool");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteWool().setMetadata(11);
	}
}