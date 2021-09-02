package net.dugged.schematicconverter.block;

public class BlockHeavyWeightedPressurePlate extends Block {
	protected static final BlockProperty power = new BlockProperty("power", new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"});

	public BlockHeavyWeightedPressurePlate() {
		super("heavy_weighted_pressure_plate");
		setOldId(148);
		setOldName("heavy_weighted_pressure_plate");
		power.setMetadataIndexBit(0);
		power.setMetadataBitCount(4);
		blockProperties.add(power);
	}

	@Override
	public Block getNewBlock() {
		return new BlockHeavyWeightedPressurePlate().setProperty(power.getName(), power.getPropertyByIndex(getMetaBits(power.getMetadataBitCount(), power.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		return new BlockHeavyWeightedPressurePlate().setMetadata(setMetaBits(power.getCurrentIndex(), power.getMetadataIndexBit()));
	}
}