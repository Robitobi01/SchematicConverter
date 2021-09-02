package net.dugged.schematicconverter.block;

public class BlockSculkSensor extends Block {
	protected static final BlockProperty power = new BlockProperty("power", new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"});
	protected static final BlockProperty sculk_sensor_phase = new BlockProperty("sculk_sensor_phase", new String[]{"inactive", "active", "cooldown"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockSculkSensor() {
		super("sculk_sensor");
		blockProperties.add(power);
		blockProperties.add(sculk_sensor_phase);
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