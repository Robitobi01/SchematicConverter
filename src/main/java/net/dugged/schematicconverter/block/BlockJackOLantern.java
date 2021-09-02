package net.dugged.schematicconverter.block;

public class BlockJackOLantern extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"south", "west", "north", "east"});

	public BlockJackOLantern() {
		super("jack_o_lantern");
		setOldId(91);
		setOldName("lut_pumpkin");
		blockProperties.add(facing);
	}

	@Override
	public Block getNewBlock() {
		return new BlockJackOLantern().setProperty(facing.getName(), facing.getPropertyByIndex(getMetaBits(facing.getMetadataBitCount(), facing.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		return new BlockJackOLantern().setMetadata(setMetaBits(facing.getCurrentIndex(), facing.getMetadataIndexBit()));
	}
}