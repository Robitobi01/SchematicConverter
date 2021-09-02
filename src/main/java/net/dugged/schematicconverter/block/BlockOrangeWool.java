package net.dugged.schematicconverter.block;

public class BlockOrangeWool extends Block {
	public BlockOrangeWool() {
		super("orange_wool");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteWool().setMetadata(1);
	}
}