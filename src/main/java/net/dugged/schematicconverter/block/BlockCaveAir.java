package net.dugged.schematicconverter.block;

public class BlockCaveAir extends Block {
	public BlockCaveAir() {
		super("cave_air");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}