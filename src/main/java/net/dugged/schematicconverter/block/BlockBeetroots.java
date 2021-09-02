package net.dugged.schematicconverter.block;

public class BlockBeetroots extends Block {
	protected static final BlockProperty age = new BlockProperty("age", new String[]{"0", "1", "2", "3"});

	public BlockBeetroots() {
		super("beetroots");
		setOldId(207);
		setOldName("beetroots");
		age.setMetadataIndexBit(0);
		age.setMetadataBitCount(2);
		blockProperties.add(age);
	}

	@Override
	public Block getNewBlock() {
		return new BlockBeetroots().setProperty(age.getName(), age.getPropertyByIndex(getMetaBits(age.getMetadataIndexBit(), age.getMetadataBitCount())));
	}

	@Override
	public Block getOldBlock() {
		return new BlockBeetroots().setMetadata(setMetaBits(age.getCurrentIndex(), age.getMetadataIndexBit()));
	}
}