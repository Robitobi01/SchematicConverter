package net.dugged.schematicconverter.block;

public class BlockGrayGlazedTerracotta extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"south", "west", "north", "east"});

	public BlockGrayGlazedTerracotta() {
		super("gray_glazed_terracotta");
		setOldId(242);
		setOldName("gray_glazed_terracotta");
		facing.setMetadataIndexBit(0);
		facing.setMetadataBitCount(2);
		blockProperties.add(facing);
	}

	@Override
	public Block getNewBlock() {
		return new BlockGrayGlazedTerracotta().setProperty(facing.getName(), facing.getPropertyByIndex(getMetaBits(facing.getMetadataIndexBit(), facing.getMetadataBitCount())));
	}

	@Override
	public Block getOldBlock() {
		return new BlockGrayGlazedTerracotta().setMetadata(setMetaBits(facing.getCurrentIndex(), facing.getMetadataIndexBit()));
	}
}