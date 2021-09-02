package net.dugged.schematicconverter.block;

public class BlockSpruceLeaves extends Block {
	protected static final BlockProperty distance = new BlockProperty("distance", new String[]{"1", "2", "3", "4", "5", "6", "7"});
	protected static final BlockProperty persistent = new BlockProperty("persistent", new String[]{"false", "true"});

	public BlockSpruceLeaves() {
		super("spruce_leaves");
		blockProperties.add(distance);
		blockProperties.add(persistent);
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		Block block = new BlockOakLeaves();
		return block.setMetadata(setMetaBits(1, persistent.getCurrentIndex(), block.getProperty(BlockOakLeaves.persistent.getName()).getMetadataIndexBit()));
	}
}