package net.dugged.schematicconverter.block;

public class BlockJungleLog extends Block {
	protected static final BlockProperty axis = new BlockProperty("axis", new String[]{"y", "x", "z"});

	public BlockJungleLog() {
		super("jungle_log");
		blockProperties.add(axis);
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		Block block = new BlockOakLog();
		return block.setMetadata(setMetaBits(3, axis.getCurrentIndex(), block.getProperty(BlockOakLog.axis.getName()).getMetadataIndexBit()));
	}
}