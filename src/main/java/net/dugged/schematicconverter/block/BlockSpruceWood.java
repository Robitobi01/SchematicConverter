package net.dugged.schematicconverter.block;

public class BlockSpruceWood extends Block {
	protected static final BlockProperty axis = new BlockProperty("axis", new String[]{"y", "x", "z"});

	public BlockSpruceWood() {
		super("spruce_wood");
		blockProperties.add(axis);
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		Block block = new BlockOakLog();
		return block.setMetadata(setMetaBits(1, 3, block.getProperty(BlockOakLog.axis.getName()).getMetadataIndexBit()));
	}
}