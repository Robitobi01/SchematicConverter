package net.dugged.schematicconverter.block;

public class BlockSnow extends Block {
	protected static final BlockProperty layers = new BlockProperty("layers", new String[]{"1", "2", "3", "4", "5", "6", "7", "8"});

	public BlockSnow() {
		super("snow");
		setOldId(78);
		setOldName("snow_layer");
		layers.setMetadataIndexBit(0);
		layers.setMetadataBitCount(3);
		blockProperties.add(layers);
	}

	@Override
	public Block getNewBlock() {
		return new BlockSnow().setProperty(layers.getName(), layers.getPropertyByIndex(getMetaBits(layers.getMetadataIndexBit(), layers.getMetadataBitCount())));

	}

	@Override
	public Block getOldBlock() {
		return new BlockSnow().setMetadata(setMetaBits(layers.getCurrentIndex(), layers.getMetadataIndexBit()));
	}
}