package net.dugged.schematicconverter.block;

public class BlockOakLog extends Block {
	protected static final BlockProperty axis = new BlockProperty("axis", new String[]{"y", "x", "z"});

	public BlockOakLog() {
		super("oak_log");
		setOldId(17);
		setOldName("log");
		axis.setMetadataIndexBit(2);
		axis.setMetadataBitCount(2);
		blockProperties.add(axis);
	}

	@Override
	public Block getNewBlock() {
		int index = getMetaBits(axis.getMetadataBitCount(), axis.getMetadataIndexBit());
		Block block;
		if (index == 3) {
			switch (getMetaBits(2, 0)) {
				case 1:
					return new BlockSpruceWood();
				case 2:
					return new BlockBirchWood();
				case 3:
					return new BlockJungleWood();
				default:
					return new BlockOakWood();
			}
		} else {
			switch (getMetaBits(2, 0)) {
				case 1:
					block = new BlockSpruceLog();
					return block.setProperty(BlockSpruceLog.axis.getName(), block.getProperty(BlockSpruceLog.axis.getName()).getPropertyByIndex(index));
				case 2:
					block = new BlockBirchLog();
					return block.setProperty(BlockBirchLog.axis.getName(), block.getProperty(BlockBirchLog.axis.getName()).getPropertyByIndex(index));
				case 3:
					block = new BlockJungleLog();
					return block.setProperty(BlockJungleLog.axis.getName(), block.getProperty(BlockJungleLog.axis.getName()).getPropertyByIndex(index));
				default:
					return new BlockOakLog().setProperty(axis.getName(), axis.getPropertyByIndex(index));
			}
		}
	}

	@Override
	public Block getOldBlock() {
		Block block = new BlockOakLog();
		return block.setMetadata(setMetaBits(3, block.getProperty(axis.getName()).getMetadataIndexBit()));
	}
}