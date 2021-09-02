package net.dugged.schematicconverter.block;

public class BlockYellowStainedGlass extends Block {
	public BlockYellowStainedGlass() {
		super("yellow_stained_glass");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteStainedGlass().setMetadata(4);
	}
}