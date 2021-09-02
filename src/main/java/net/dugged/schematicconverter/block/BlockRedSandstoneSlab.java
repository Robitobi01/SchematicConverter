package net.dugged.schematicconverter.block;

public class BlockRedSandstoneSlab extends Block {
	protected static final BlockProperty type = new BlockProperty("type", new String[]{"bottom", "top", "double"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockRedSandstoneSlab() {
		super("red_sandstone_slab");
		setOldId(182);
		setOldName("stone_slab2");
		type.setMetadataIndexBit(3);
		type.setMetadataBitCount(1);
		blockProperties.add(type);
		blockProperties.add(waterlogged);
	}

	@Override
	public Block getNewBlock() {
		return new BlockRedSandstoneSlab().setProperty(type.getName(), type.getPropertyByIndex(getMetaBits(type.getMetadataBitCount(), type.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		if (type.getValue().equals("double")) {
			return new BlockRedSandstoneDoubleSlab().setMetadata(getMetaBits(3, 0));
		} else {
			return new BlockRedSandstoneSlab().setMetadata(setMetaBits(type.getCurrentIndex(), 3));
		}
	}
}