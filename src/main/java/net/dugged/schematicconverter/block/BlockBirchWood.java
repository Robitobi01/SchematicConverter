package net.dugged.schematicconverter.block;

public class BlockBirchWood extends Block {
	protected static final BlockProperty axis = new BlockProperty("axis", new String[]{"y", "x", "z"});

	public BlockBirchWood() {
		super("birch_wood");
		blockProperties.add(axis);
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		Block block = new BlockOakLog();
		return block.setMetadata(setMetaBits(2, 3, block.getProperty(BlockOakLog.axis.getName()).getMetadataIndexBit()));
	}
}