package net.dugged.schematicconverter.block;

public class BlockStrippedOakWood extends Block {
	protected static final BlockProperty axis = new BlockProperty("axis", new String[]{"y", "x", "z"});

	public BlockStrippedOakWood() {
		super("stripped_oak_wood");
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