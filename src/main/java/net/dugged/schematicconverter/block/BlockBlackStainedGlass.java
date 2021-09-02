package net.dugged.schematicconverter.block;

public class BlockBlackStainedGlass extends Block {
	public BlockBlackStainedGlass() {
		super("black_stained_glass");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteStainedGlass().setMetadata(15);
	}
}