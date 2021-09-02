package net.dugged.schematicconverter.block;

public class BlockNetherPortal extends Block {
	protected static final BlockProperty axis = new BlockProperty("axis", new String[]{"x", "z"});

	public BlockNetherPortal() {
		super("nether_portal");
		setOldId(90);
		setOldName("portal");
		axis.setMetadataIndexBit(0);
		axis.setMetadataBitCount(2);
		blockProperties.add(axis);
	}

	@Override
	public Block getNewBlock() {
		if (metadata == 2) {
			return new BlockNetherPortal().setProperty(axis.getName(), "z");
		} else {
			return new BlockNetherPortal();
		}
	}

	@Override
	public Block getOldBlock() {
		if (axis.getValue().equals("z")) {
			return new BlockNetherPortal().setMetadata(2);
		} else {
			return this;
		}
	}
}