package net.dugged.schematicconverter.block;

public class BlockWhiteGlazedTerracotta extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"south", "west", "north", "east"});

	public BlockWhiteGlazedTerracotta() {
		super("white_glazed_terracotta");
		setOldId(235);
		setOldName("white_glazed_terracotta");
		facing.setMetadataIndexBit(0);
		facing.setMetadataBitCount(2);
		blockProperties.add(facing);
	}

	@Override
	public Block getNewBlock() {
		return new BlockWhiteGlazedTerracotta().setProperty(facing.getName(), facing.getPropertyByIndex(getMetaBits(facing.getMetadataIndexBit(), facing.getMetadataBitCount())));
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteGlazedTerracotta().setMetadata(setMetaBits(facing.getCurrentIndex(), facing.getMetadataIndexBit()));
	}
}