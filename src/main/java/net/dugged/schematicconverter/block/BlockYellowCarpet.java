package net.dugged.schematicconverter.block;

public class BlockYellowCarpet extends Block {
	public BlockYellowCarpet() {
		super("yellow_carpet");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteCarpet().setMetadata(4);
	}
}