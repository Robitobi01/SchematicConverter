package net.dugged.schematicconverter.block;

public class BlockFarmland extends Block {
	protected static final BlockProperty moisture = new BlockProperty("moisture", new String[]{"0", "1", "2", "3", "4", "5", "6", "7"});

	public BlockFarmland() {
		super("farmland");
		setOldId(60);
		setOldName("farmland");
		moisture.setMetadataIndexBit(0);
		moisture.setMetadataBitCount(3);
		blockProperties.add(moisture);
	}

	@Override
	public Block getNewBlock() {
		return new BlockFarmland().setProperty(moisture.getName(), moisture.getPropertyByIndex(getMetaBits(moisture.getMetadataIndexBit(), moisture.getMetadataBitCount())));
	}

	@Override
	public Block getOldBlock() {
		return new BlockFarmland().setMetadata(setMetaBits(moisture.getCurrentIndex(), moisture.getMetadataIndexBit()));
	}
}
