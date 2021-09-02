package net.dugged.schematicconverter.block;

public class BlockAcaciaLog extends Block {
	protected static final BlockProperty axis = new BlockProperty("axis", new String[]{"y", "x", "z"});

	public BlockAcaciaLog() {
		super("acacia_log");
		setOldId(162);
		setOldName("log2");
		axis.setMetadataIndexBit(2);
		axis.setMetadataBitCount(2);
		blockProperties.add(axis);
	}

	@Override
	public Block getNewBlock() {
		int index = getMetaBits(axis.getMetadataBitCount(), axis.getMetadataIndexBit());
		Block block;
		if (index == 3) {
			if (getMetaBits(2, 0) == 1) {
				return this;
			}
			return this;
		} else {
			if (getMetaBits(2, 0) == 1) {
				block = new BlockDarkOakLog();
				return block.setProperty(BlockDarkOakLog.axis.getName(), block.getProperty(BlockDarkOakLog.axis.getName()).getPropertyByIndex(index));
			}
			return new BlockAcaciaLog().setProperty(axis.getName(), axis.getPropertyByIndex(index));
		}
	}

	@Override
	public Block getOldBlock() {
		Block block = new BlockAcaciaLog();
		return block.setMetadata(setMetaBits(3, block.getProperty(axis.getName()).getMetadataIndexBit()));
	}
}