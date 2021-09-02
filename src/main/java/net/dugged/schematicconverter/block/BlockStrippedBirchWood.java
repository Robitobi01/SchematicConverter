package net.dugged.schematicconverter.block;

public class BlockStrippedBirchWood extends Block {
	protected static final BlockProperty axis = new BlockProperty("axis", new String[]{"y", "x", "z"});

	public BlockStrippedBirchWood() {
		super("stripped_birch_wood");
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