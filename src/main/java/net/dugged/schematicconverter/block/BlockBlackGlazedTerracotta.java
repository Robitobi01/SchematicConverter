package net.dugged.schematicconverter.block;

public class BlockBlackGlazedTerracotta extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"south", "west", "north", "east"});

	public BlockBlackGlazedTerracotta() {
		super("black_glazed_terracotta");
		setOldId(250);
		setOldName("black_glazed_terracotta");
		facing.setMetadataIndexBit(0);
		facing.setMetadataBitCount(2);
		blockProperties.add(facing);
	}

	@Override
	public Block getNewBlock() {
		return new BlockBlackGlazedTerracotta().setProperty(facing.getName(), facing.getPropertyByIndex(getMetaBits(facing.getMetadataIndexBit(), facing.getMetadataBitCount())));
	}

	@Override
	public Block getOldBlock() {
		return new BlockBlackGlazedTerracotta().setMetadata(setMetaBits(facing.getCurrentIndex(), facing.getMetadataIndexBit()));
	}
}