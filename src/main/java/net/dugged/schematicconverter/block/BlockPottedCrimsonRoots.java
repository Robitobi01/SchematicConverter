package net.dugged.schematicconverter.block;

public class BlockPottedCrimsonRoots extends Block {
	public BlockPottedCrimsonRoots() {
		super("potted_crimson_roots");
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