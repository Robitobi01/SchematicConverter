package net.dugged.schematicconverter.block;

public class BlockStonePressurePlate extends Block {
	protected static final BlockProperty powered = new BlockProperty("powered", new String[]{"false", "true"});

	public BlockStonePressurePlate() {
		super("stone_pressure_plate");
		setOldId(70);
		setOldName("stone_pressure_plate");
		powered.setMetadataIndexBit(0);
		powered.setMetadataBitCount(1);
		blockProperties.add(powered);
	}

	@Override
	public Block getNewBlock() {
		return new BlockStonePressurePlate().setProperty(powered.getName(), powered.getPropertyByIndex(getMetaBits(powered.getMetadataBitCount(), powered.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		return new BlockStonePressurePlate().setMetadata(setMetaBits(powered.getCurrentIndex(), powered.getMetadataIndexBit()));
	}
}