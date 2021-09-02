package net.dugged.schematicconverter.block;

public class BlockVoidAir extends Block {
	public BlockVoidAir() {
		super("void_air");
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