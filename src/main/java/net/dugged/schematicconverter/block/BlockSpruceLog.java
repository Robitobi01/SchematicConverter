package net.dugged.schematicconverter.block;

public class BlockSpruceLog extends Block {
	protected static final BlockProperty axis = new BlockProperty("axis", new String[]{"y", "x", "z"});

	public BlockSpruceLog() {
		super("spruce_log");
		blockProperties.add(axis);
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		Block block = new BlockOakLog();
		return block.setMetadata(setMetaBits(1, axis.getCurrentIndex(), block.getProperty(BlockOakLog.axis.getName()).getMetadataIndexBit()));
	}
}