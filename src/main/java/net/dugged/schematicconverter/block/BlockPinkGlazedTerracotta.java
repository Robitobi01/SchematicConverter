package net.dugged.schematicconverter.block;

public class BlockPinkGlazedTerracotta extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"south", "west", "north", "east"});

	public BlockPinkGlazedTerracotta() {
		super("pink_glazed_terracotta");
		setOldId(241);
		setOldName("pink_glazed_terracotta");
		facing.setMetadataIndexBit(0);
		facing.setMetadataBitCount(2);
		blockProperties.add(facing);
	}

	@Override
	public Block getNewBlock() {
		return new BlockPinkGlazedTerracotta().setProperty(facing.getName(), facing.getPropertyByIndex(getMetaBits(facing.getMetadataIndexBit(), facing.getMetadataBitCount())));
	}

	@Override
	public Block getOldBlock() {
		return new BlockPinkGlazedTerracotta().setMetadata(setMetaBits(facing.getCurrentIndex(), facing.getMetadataIndexBit()));
	}
}