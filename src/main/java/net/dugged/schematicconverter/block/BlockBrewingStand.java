package net.dugged.schematicconverter.block;

public class BlockBrewingStand extends Block {
	protected static final BlockProperty has_bottle_0 = new BlockProperty("has_bottle_0", new String[]{"false", "true"});
	protected static final BlockProperty has_bottle_1 = new BlockProperty("has_bottle_1", new String[]{"false", "true"});
	protected static final BlockProperty has_bottle_2 = new BlockProperty("has_bottle_2", new String[]{"false", "true"});

	public BlockBrewingStand() {
		super("brewing_stand");
		setOldId(117);
		setOldName("brewing_stand");
		has_bottle_0.setMetadataIndexBit(0);
		has_bottle_0.setMetadataBitCount(1);
		has_bottle_1.setMetadataIndexBit(1);
		has_bottle_1.setMetadataBitCount(1);
		has_bottle_2.setMetadataIndexBit(2);
		has_bottle_2.setMetadataBitCount(1);
		blockProperties.add(has_bottle_0);
		blockProperties.add(has_bottle_1);
		blockProperties.add(has_bottle_2);
	}

	@Override
	public Block getNewBlock() {
		Block block = new BlockEndPortalFrame().setProperty(has_bottle_0.getName(), has_bottle_0.getPropertyByIndex(getMetaBits(has_bottle_0.getMetadataBitCount(), has_bottle_0.getMetadataIndexBit())));
		block = block.setProperty(has_bottle_1.getName(), has_bottle_1.getPropertyByIndex(getMetaBits(has_bottle_1.getMetadataBitCount(), has_bottle_1.getMetadataIndexBit())));
		return block.setProperty(has_bottle_2.getName(), has_bottle_2.getPropertyByIndex(getMetaBits(has_bottle_2.getMetadataBitCount(), has_bottle_2.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		Block block = new BlockEndPortalFrame().setMetadata(setMetaBits(has_bottle_0.getCurrentIndex(), has_bottle_0.getMetadataIndexBit()));
		block = block.setMetadata(block.setMetaBits(has_bottle_1.getCurrentIndex(), has_bottle_1.getMetadataIndexBit()));
		return block.setMetadata(block.setMetaBits(has_bottle_2.getCurrentIndex(), has_bottle_2.getMetadataIndexBit()));
	}
}