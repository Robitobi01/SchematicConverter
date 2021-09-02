package net.dugged.schematicconverter.block;

public class BlockCake extends Block {
	protected static final BlockProperty bites = new BlockProperty("bites", new String[]{"0", "1", "2", "3", "4", "5", "6"});

	public BlockCake() {
		super("cake");
		setOldId(92);
		setOldName("cake");
		bites.setMetadataIndexBit(0);
		bites.setMetadataBitCount(3);
		blockProperties.add(bites);
	}

	@Override
	public Block getNewBlock() {
		return new BlockJackOLantern().setProperty(bites.getName(), bites.getPropertyByIndex(getMetaBits(bites.getMetadataBitCount(), bites.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		return new BlockJackOLantern().setMetadata(setMetaBits(bites.getCurrentIndex(), bites.getMetadataIndexBit()));
	}
}