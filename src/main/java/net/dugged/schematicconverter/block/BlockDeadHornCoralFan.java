package net.dugged.schematicconverter.block;

public class BlockDeadHornCoralFan extends Block {
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockDeadHornCoralFan() {
		super("dead_horn_coral_fan");
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