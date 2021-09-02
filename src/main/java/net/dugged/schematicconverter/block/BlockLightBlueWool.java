package net.dugged.schematicconverter.block;

public class BlockLightBlueWool extends Block {
	public BlockLightBlueWool() {
		super("light_blue_wool");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteWool().setMetadata(3);
	}
}