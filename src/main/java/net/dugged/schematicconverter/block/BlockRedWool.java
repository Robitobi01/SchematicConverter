package net.dugged.schematicconverter.block;

public class BlockRedWool extends Block {
	public BlockRedWool() {
		super("red_wool");
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