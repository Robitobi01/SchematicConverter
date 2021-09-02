package net.dugged.schematicconverter.block;

public class BlockPumpkinStem extends Block {
	protected static final BlockProperty age = new BlockProperty("age", new String[]{"0", "1", "2", "3", "4", "5", "6", "7"});

	public BlockPumpkinStem() {
		super("pumpkin_stem");
		setOldId(104);
		setOldName("pumpkin_stem");
		age.setMetadataIndexBit(0);
		age.setMetadataBitCount(3);
		blockProperties.add(age);
	}

	@Override
	public Block getNewBlock() {
		return new BlockPumpkinStem().setProperty(age.getName(), age.getPropertyByIndex(getMetaBits(age.getMetadataIndexBit(), age.getMetadataBitCount())));
	}

	@Override
	public Block getOldBlock() {
		return new BlockPumpkinStem().setMetadata(setMetaBits(age.getCurrentIndex(), age.getMetadataIndexBit()));
	}
}