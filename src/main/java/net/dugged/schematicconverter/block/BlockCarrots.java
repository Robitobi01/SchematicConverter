package net.dugged.schematicconverter.block;

public class BlockCarrots extends Block {
	protected static final BlockProperty age = new BlockProperty("age", new String[]{"0", "1", "2", "3", "4", "5", "6", "7"});

	public BlockCarrots() {
		super("carrots");
		setOldId(141);
		setOldName("carrots");
		age.setMetadataIndexBit(0);
		age.setMetadataBitCount(3);
		blockProperties.add(age);
	}

	@Override
	public Block getNewBlock() {
		return new BlockCarrots().setProperty(age.getName(), age.getPropertyByIndex(getMetaBits(age.getMetadataIndexBit(), age.getMetadataBitCount())));
	}

	@Override
	public Block getOldBlock() {
		return new BlockCarrots().setMetadata(setMetaBits(age.getCurrentIndex(), age.getMetadataIndexBit()));
	}
}