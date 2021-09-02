package net.dugged.schematicconverter.block;

public class BlockPurpurSlab extends Block {
	protected static final BlockProperty type = new BlockProperty("type", new String[]{"bottom", "top", "double"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockPurpurSlab() {
		super("purpur_slab");
		setOldId(205);
		setOldName("purpur_slab");
		blockProperties.add(type);
		blockProperties.add(waterlogged);
	}

	@Override
	public Block getNewBlock() {
		if (metadata == 8) {
			return new BlockPurpurSlab().setProperty(type.getName(), "top");
		} else {
			return this;
		}
	}

	@Override
	public Block getOldBlock() {
		if (type.getValue().equals("double")) {
			return new BlockPurpurDoubleSlab();
		} else if (type.getValue().equals("top")) {
			return new BlockPurpurSlab().setMetadata(8);
		} else {
			return this;
		}
	}
}