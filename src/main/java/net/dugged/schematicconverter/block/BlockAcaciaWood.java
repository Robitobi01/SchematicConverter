package net.dugged.schematicconverter.block;

public class BlockAcaciaWood extends Block {
	protected static final BlockProperty axis = new BlockProperty("axis", new String[]{"y", "x", "z"});

	public BlockAcaciaWood() {
		super("acacia_wood");
		blockProperties.add(axis);
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		Block block = new BlockAcaciaLog();
		return block.setMetadata(setMetaBits(3, block.getProperty(BlockAcaciaLog.axis.getName()).getMetadataIndexBit()));
	}
}