package net.dugged.schematicconverter.block;

public class BlockYellowGlazedTerracotta extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"south", "west", "north", "east"});

	public BlockYellowGlazedTerracotta() {
		super("yellow_glazed_terracotta");
		setOldId(239);
		setOldName("yellow_glazed_terracotta");
		facing.setMetadataIndexBit(0);
		facing.setMetadataBitCount(2);
		blockProperties.add(facing);
	}

	@Override
	public Block getNewBlock() {
		return new BlockYellowGlazedTerracotta().setProperty(facing.getName(), facing.getPropertyByIndex(getMetaBits(facing.getMetadataIndexBit(), facing.getMetadataBitCount())));
	}

	@Override
	public Block getOldBlock() {
		return new BlockYellowGlazedTerracotta().setMetadata(setMetaBits(facing.getCurrentIndex(), facing.getMetadataIndexBit()));
	}
}