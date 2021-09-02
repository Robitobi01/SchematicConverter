package net.dugged.schematicconverter.block;

public class BlockWhiteBanner extends Block {
	protected static final BlockProperty rotation = new BlockProperty("rotation", new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"});

	public BlockWhiteBanner() {
		super("white_banner");
		setOldId(176);
		setOldName("standing_banner");
		rotation.setMetadataIndexBit(0);
		rotation.setMetadataBitCount(4);
		blockProperties.add(rotation);
	}

	@Override
	public Block getNewBlock() {
		return new BlockWhiteBanner().setProperty(rotation.getName(), rotation.getPropertyByIndex(getMetaBits(rotation.getMetadataBitCount(), rotation.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteBanner().setMetadata(setMetaBits(rotation.getCurrentIndex(), rotation.getMetadataIndexBit()));
	}
}