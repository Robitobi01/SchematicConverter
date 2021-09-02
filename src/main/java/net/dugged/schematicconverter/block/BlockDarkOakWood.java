package net.dugged.schematicconverter.block;

public class BlockDarkOakWood extends Block {
	protected static final BlockProperty axis = new BlockProperty("axis", new String[]{"y", "x", "z"});

	public BlockDarkOakWood() {
		super("dark_oak_wood");
		blockProperties.add(axis);
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		Block block = new BlockAcaciaLog();
		return block.setMetadata(setMetaBits(1, 3, block.getProperty(BlockAcaciaLog.axis.getName()).getMetadataIndexBit()));
	}
}