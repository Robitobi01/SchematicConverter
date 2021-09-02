package net.dugged.schematicconverter.block;

public class BlockPolishedBasalt extends Block {
	protected static final BlockProperty axis = new BlockProperty("axis", new String[]{"y", "x", "z"});

	public BlockPolishedBasalt() {
		super("polished_basalt");
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