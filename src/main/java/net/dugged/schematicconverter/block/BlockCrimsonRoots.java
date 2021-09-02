package net.dugged.schematicconverter.block;

public class BlockCrimsonRoots extends Block {
	public BlockCrimsonRoots() {
		super("crimson_roots");
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