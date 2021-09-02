package net.dugged.schematicconverter.block;

public class BlockChorusFlower extends Block {
	protected static final BlockProperty age = new BlockProperty("age", new String[]{"0", "1", "2", "3", "4", "5"});

	public BlockChorusFlower() {
		super("chorus_flower");
		setOldId(200);
		setOldName("chorus_flower");
		age.setMetadataIndexBit(0);
		age.setMetadataBitCount(3);
		blockProperties.add(age);
	}

	@Override
	public Block getNewBlock() {
		return new BlockChorusFlower().setProperty(age.getName(), age.getPropertyByIndex(getMetaBits(age.getMetadataIndexBit(), age.getMetadataBitCount())));
	}

	@Override
	public Block getOldBlock() {
		return new BlockChorusFlower().setMetadata(setMetaBits(age.getCurrentIndex(), age.getMetadataIndexBit()));
	}
}