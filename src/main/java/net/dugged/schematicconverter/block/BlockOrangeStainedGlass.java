package net.dugged.schematicconverter.block;

public class BlockOrangeStainedGlass extends Block {
	public BlockOrangeStainedGlass() {
		super("orange_stained_glass");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteStainedGlass().setMetadata(1);
	}
}