package net.dugged.schematicconverter.block;

public class BlockDeadFireCoralFan extends Block {
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockDeadFireCoralFan() {
		super("dead_fire_coral_fan");
		blockProperties.add(waterlogged);
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