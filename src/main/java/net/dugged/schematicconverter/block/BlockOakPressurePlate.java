package net.dugged.schematicconverter.block;

public class BlockOakPressurePlate extends Block {
	protected static final BlockProperty powered = new BlockProperty("powered", new String[]{"false", "true"});

	public BlockOakPressurePlate() {
		super("oak_pressure_plate");
		setOldId(72);
		setOldName("wooden_pressure_plate");
		powered.setMetadataIndexBit(0);
		powered.setMetadataBitCount(1);
		blockProperties.add(powered);
	}

	@Override
	public Block getNewBlock() {
		return new BlockOakPressurePlate().setProperty(powered.getName(), powered.getPropertyByIndex(getMetaBits(powered.getMetadataBitCount(), powered.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		return new BlockOakPressurePlate().setMetadata(setMetaBits(powered.getCurrentIndex(), powered.getMetadataIndexBit()));
	}
}