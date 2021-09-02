package net.dugged.schematicconverter.block;

public class BlockFireCoralFan extends Block {
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockFireCoralFan() {
		super("fire_coral_fan");
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