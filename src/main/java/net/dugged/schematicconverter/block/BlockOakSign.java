package net.dugged.schematicconverter.block;

public class BlockOakSign extends Block {
	protected static final BlockProperty rotation = new BlockProperty("rotation", new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockOakSign() {
		super("oak_sign");
		setOldId(63);
		setOldName("standing_sign");
		rotation.setMetadataIndexBit(0);
		rotation.setMetadataBitCount(4);
		blockProperties.add(rotation);
		blockProperties.add(waterlogged);
	}

	@Override
	public Block getNewBlock() {
		return new BlockOakSign().setProperty(rotation.getName(), rotation.getPropertyByIndex(getMetaBits(rotation.getMetadataBitCount(), rotation.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		return new BlockOakSign().setMetadata(setMetaBits(rotation.getCurrentIndex(), rotation.getMetadataIndexBit()));
	}
}