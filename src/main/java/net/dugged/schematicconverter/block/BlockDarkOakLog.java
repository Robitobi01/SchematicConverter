package net.dugged.schematicconverter.block;

public class BlockDarkOakLog extends Block {
	protected static final BlockProperty axis = new BlockProperty("axis", new String[]{"y", "x", "z"});

	public BlockDarkOakLog() {
		super("dark_oak_log");
		blockProperties.add(axis);
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		Block block = new BlockAcaciaLog();
		return block.setMetadata(setMetaBits(1, axis.getCurrentIndex(), block.getProperty(BlockAcaciaLog.axis.getName()).getMetadataIndexBit()));
	}
}