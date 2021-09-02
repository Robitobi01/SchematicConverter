package net.dugged.schematicconverter.block;

public class BlockNetherWart extends Block {
	protected static final BlockProperty age = new BlockProperty("age", new String[]{"0", "1", "2", "3"});

	public BlockNetherWart() {
		super("nether_wart");
		setOldId(115);
		setOldName("nether_wart");
		age.setMetadataIndexBit(0);
		age.setMetadataBitCount(2);
		blockProperties.add(age);
	}

	@Override
	public Block getNewBlock() {
		return new BlockNetherWart().setProperty(age.getName(), age.getPropertyByIndex(getMetaBits(age.getMetadataIndexBit(), age.getMetadataBitCount())));
	}

	@Override
	public Block getOldBlock() {
		return new BlockNetherWart().setMetadata(setMetaBits(age.getCurrentIndex(), age.getMetadataIndexBit()));
	}
}