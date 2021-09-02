package net.dugged.schematicconverter.block;

public class BlockPurpurPillar extends Block {
	protected static final BlockProperty axis = new BlockProperty("axis", new String[]{"y", "x", "z"});

	public BlockPurpurPillar() {
		super("purpur_pillar");
		setOldId(202);
		setOldName("purpur_pillar");
		axis.setMetadataIndexBit(0);
		axis.setMetadataBitCount(4);
		blockProperties.add(axis);
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 4:
				return new BlockPurpurPillar().setProperty(axis.getName(), "x");
			case 8:
				return new BlockPurpurPillar().setProperty(axis.getName(), "z");
			default:
				return new BlockPurpurPillar().setProperty(axis.getName(), "y");
		}
	}

	@Override
	public Block getOldBlock() {
		switch (axis.getValue()) {
			case "x":
				return new BlockPurpurPillar().setMetadata(4);
			case "y":
				return new BlockPurpurPillar().setMetadata(8);
			default:
				return new BlockPurpurPillar();
		}
	}
}