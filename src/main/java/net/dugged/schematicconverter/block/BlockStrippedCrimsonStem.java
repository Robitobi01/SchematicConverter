package net.dugged.schematicconverter.block;

public class BlockStrippedCrimsonStem extends Block {
	protected static final BlockProperty axis = new BlockProperty("axis", new String[]{"y", "x", "z"});

	public BlockStrippedCrimsonStem() {
		super("stripped_crimson_stem");
		blockProperties.add(axis);
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