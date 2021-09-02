package net.dugged.schematicconverter.block;

public class BlockPolishedBlackstonePressurePlate extends Block {
	protected static final BlockProperty powered = new BlockProperty("powered", new String[]{"false", "true"});

	public BlockPolishedBlackstonePressurePlate() {
		super("polished_blackstone_pressure_plate");
		blockProperties.add(powered);
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