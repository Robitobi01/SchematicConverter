package net.dugged.schematicconverter.block;

public class BlockBoneBlock extends Block {
	protected static final BlockProperty axis = new BlockProperty("axis", new String[]{"y", "x", "z"});

	public BlockBoneBlock() {
		super("bone_block");
		setOldId(216);
		setOldName("bone_block");
		axis.setMetadataIndexBit(0);
		axis.setMetadataBitCount(4);
		blockProperties.add(axis);
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 4:
				return new BlockBoneBlock().setProperty(axis.getName(), "x");
			case 8:
				return new BlockBoneBlock().setProperty(axis.getName(), "z");
			default:
				return new BlockBoneBlock().setProperty(axis.getName(), "y");
		}
	}

	@Override
	public Block getOldBlock() {
		switch (axis.getValue()) {
			case "x":
				return new BlockBoneBlock().setMetadata(4);
			case "z":
				return new BlockBoneBlock().setMetadata(8);
			default:
				return new BlockBoneBlock();
		}
	}
}