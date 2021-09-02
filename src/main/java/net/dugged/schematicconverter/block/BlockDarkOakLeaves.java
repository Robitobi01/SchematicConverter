package net.dugged.schematicconverter.block;

public class BlockDarkOakLeaves extends Block {
	protected static final BlockProperty distance = new BlockProperty("distance", new String[]{"1", "2", "3", "4", "5", "6", "7"});
	protected static final BlockProperty persistent = new BlockProperty("persistent", new String[]{"false", "true"});

	public BlockDarkOakLeaves() {
		super("dark_oak_leaves");
		blockProperties.add(distance);
		blockProperties.add(persistent);
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		Block block = new BlockAcaciaLeaves();
		return block.setMetadata(setMetaBits(1, persistent.getCurrentIndex(), block.getProperty(BlockAcaciaLeaves.persistent.getName()).getMetadataIndexBit()));
	}
}