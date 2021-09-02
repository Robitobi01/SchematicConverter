package net.dugged.schematicconverter.block;

public class BlockMelonStem extends Block {
	protected static final BlockProperty age = new BlockProperty("age", new String[]{"0", "1", "2", "3", "4", "5", "6", "7"});

	public BlockMelonStem() {
		super("melon_stem");
		setOldId(105);
		setOldName("melon_stem");
		age.setMetadataIndexBit(0);
		age.setMetadataBitCount(3);
		blockProperties.add(age);
	}

	@Override
	public Block getNewBlock() {
		return new BlockMelonStem().setProperty(age.getName(), age.getPropertyByIndex(getMetaBits(age.getMetadataIndexBit(), age.getMetadataBitCount())));
	}

	@Override
	public Block getOldBlock() {
		return new BlockMelonStem().setMetadata(setMetaBits(age.getCurrentIndex(), age.getMetadataIndexBit()));
	}
}