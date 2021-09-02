package net.dugged.schematicconverter.block;

public class BlockStrippedWarpedHyphae extends Block {
	protected static final BlockProperty axis = new BlockProperty("axis", new String[]{"y", "x", "z"});

	public BlockStrippedWarpedHyphae() {
		super("stripped_warped_hyphae");
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