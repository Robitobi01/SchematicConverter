package net.dugged.schematicconverter.block;

public class BlockStrippedJungleLog extends Block {
	protected static final BlockProperty axis = new BlockProperty("axis", new String[]{"y", "x", "z"});

	public BlockStrippedJungleLog() {
		super("stripped_jungle_log");
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