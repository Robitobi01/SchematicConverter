package net.dugged.schematicconverter.block;

public class BlockJukebox extends Block {
	protected static final BlockProperty has_record = new BlockProperty("has_record", new String[]{"false", "true"});

	public BlockJukebox() {
		super("jukebox");
		setOldId(84);
		setOldName("jukebox");
		has_record.setMetadataIndexBit(0);
		has_record.setMetadataBitCount(1);
		blockProperties.add(has_record);
	}

	@Override
	public Block getNewBlock() {
		return new BlockJukebox().setProperty(has_record.getName(), has_record.getPropertyByIndex(getMetaBits(has_record.getMetadataBitCount(), has_record.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		return new BlockDispenser().setMetadata(setMetaBits(has_record.getCurrentIndex(), has_record.getMetadataIndexBit()));
	}
}