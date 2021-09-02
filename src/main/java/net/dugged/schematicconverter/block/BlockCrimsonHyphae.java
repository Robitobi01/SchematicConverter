package net.dugged.schematicconverter.block;

public class BlockCrimsonHyphae extends Block {
	protected static final BlockProperty axis = new BlockProperty("axis", new String[]{"y", "x", "z"});

	public BlockCrimsonHyphae() {
		super("crimson_hyphae");
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