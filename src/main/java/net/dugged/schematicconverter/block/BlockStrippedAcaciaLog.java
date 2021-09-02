package net.dugged.schematicconverter.block;

public class BlockStrippedAcaciaLog extends Block {
	protected static final BlockProperty axis = new BlockProperty("axis", new String[]{"y", "x", "z"});

	public BlockStrippedAcaciaLog() {
		super("stripped_acacia_log");
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