package net.dugged.schematicconverter.block;

public class BlockHayBlock extends Block {
	protected static final BlockProperty axis = new BlockProperty("axis", new String[]{"y", "x", "z"});

	public BlockHayBlock() {
		super("hay_block");
		setOldId(170);
		setOldName("hay_block");
		axis.setMetadataIndexBit(0);
		axis.setMetadataBitCount(4);
		blockProperties.add(axis);
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 4:
				return new BlockHayBlock().setProperty(axis.getName(), "x");
			case 8:
				return new BlockHayBlock().setProperty(axis.getName(), "z");
			default:
				return new BlockHayBlock();
		}
	}

	@Override
	public Block getOldBlock() {
		switch (axis.getValue()) {
			case "x":
				return new BlockHayBlock().setMetadata(4);
			case "z":
				return new BlockHayBlock().setMetadata(8);
			default:
				return new BlockHayBlock();
		}
	}
}