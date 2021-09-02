package net.dugged.schematicconverter.block;

public class BlockWheat extends Block {
	protected static final BlockProperty age = new BlockProperty("age", new String[]{"0", "1", "2", "3", "4", "5", "6", "7"});

	public BlockWheat() {
		super("wheat");
		setOldId(59);
		setOldName("wheat");
		age.setMetadataIndexBit(0);
		age.setMetadataBitCount(3);
		blockProperties.add(age);
	}

	@Override
	public Block getNewBlock() {
		return new BlockWheat().setProperty(age.getName(), age.getPropertyByIndex(getMetaBits(age.getMetadataIndexBit(), age.getMetadataBitCount())));
	}

	@Override
	public Block getOldBlock() {
		return new BlockWheat().setMetadata(setMetaBits(age.getCurrentIndex(), age.getMetadataIndexBit()));
	}
}