package net.dugged.schematicconverter.block;

public class BlockStrippedCrimsonHyphae extends Block {
	protected static final BlockProperty axis = new BlockProperty("axis", new String[]{"y", "x", "z"});

	public BlockStrippedCrimsonHyphae() {
		super("stripped_crimson_hyphae");
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