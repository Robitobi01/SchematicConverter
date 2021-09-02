package net.dugged.schematicconverter.block;

public class BlockCyanWool extends Block {
	public BlockCyanWool() {
		super("cyan_wool");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteWool().setMetadata(9);
	}
}