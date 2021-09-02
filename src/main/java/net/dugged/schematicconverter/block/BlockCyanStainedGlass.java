package net.dugged.schematicconverter.block;

public class BlockCyanStainedGlass extends Block {
	public BlockCyanStainedGlass() {
		super("cyan_stained_glass");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteStainedGlass().setMetadata(9);
	}
}