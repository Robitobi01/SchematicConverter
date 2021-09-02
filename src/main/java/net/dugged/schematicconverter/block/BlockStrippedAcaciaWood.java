package net.dugged.schematicconverter.block;

public class BlockStrippedAcaciaWood extends Block {
	protected static final BlockProperty axis = new BlockProperty("axis", new String[]{"y", "x", "z"});

	public BlockStrippedAcaciaWood() {
		super("stripped_acacia_wood");
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