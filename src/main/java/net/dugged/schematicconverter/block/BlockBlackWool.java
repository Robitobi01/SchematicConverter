package net.dugged.schematicconverter.block;

public class BlockBlackWool extends Block {
	public BlockBlackWool() {
		super("black_wool");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteWool().setMetadata(15);
	}
}