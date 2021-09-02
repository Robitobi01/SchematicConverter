package net.dugged.schematicconverter.block;

public class BlockPinkStainedGlass extends Block {
	public BlockPinkStainedGlass() {
		super("pink_stained_glass");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteStainedGlass().setMetadata(6);
	}
}