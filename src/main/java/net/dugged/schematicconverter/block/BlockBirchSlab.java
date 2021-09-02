package net.dugged.schematicconverter.block;

public class BlockBirchSlab extends Block {
	protected static final BlockProperty type = new BlockProperty("type", new String[]{"bottom", "top", "double"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockBirchSlab() {
		super("birch_slab");
		type.setMetadataIndexBit(3);
		type.setMetadataBitCount(1);
		blockProperties.add(type);
		blockProperties.add(waterlogged);
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		if (type.getValue().equals("double")) {
			return new BlockDoubleOakSlab().setMetadata(2);
		} else {
			return new BlockOakSlab().setMetadata(setMetaBits(2, type.getCurrentIndex(), 3));
		}
	}
}