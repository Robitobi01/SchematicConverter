package net.dugged.schematicconverter.block;

public class BlockBirchLog extends Block {
	protected static final BlockProperty axis = new BlockProperty("axis", new String[]{"y", "x", "z"});

	public BlockBirchLog() {
		super("birch_log");
		blockProperties.add(axis);
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		Block block = new BlockOakLog();
		return block.setMetadata(setMetaBits(2, axis.getCurrentIndex(), block.getProperty(BlockOakLog.axis.getName()).getMetadataIndexBit()));
	}
}