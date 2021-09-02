package net.dugged.schematicconverter.block;

public class BlockYellowWool extends Block {
	public BlockYellowWool() {
		super("yellow_wool");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteWool().setMetadata(4);
	}
}