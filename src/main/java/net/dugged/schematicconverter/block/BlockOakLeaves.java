package net.dugged.schematicconverter.block;

public class BlockOakLeaves extends Block {
	protected static final BlockProperty distance = new BlockProperty("distance", new String[]{"1", "2", "3", "4", "5", "6", "7"});
	protected static final BlockProperty persistent = new BlockProperty("persistent", new String[]{"false", "true"});

	public BlockOakLeaves() {
		super("oak_leaves");
		setOldId(18);
		setOldName("leaves");
		persistent.setMetadataIndexBit(2);
		persistent.setMetadataBitCount(2);
		blockProperties.add(distance);
		blockProperties.add(persistent);
	}

	@Override
	public Block getNewBlock() {
		int index = getMetaBits(persistent.getMetadataBitCount(), persistent.getMetadataIndexBit());
		Block block;
		switch (getMetaBits(2, 0)) {
			case 1:
				block = new BlockSpruceLeaves();
				return block.setProperty(BlockSpruceLeaves.persistent.getName(), block.getProperty(BlockSpruceLeaves.persistent.getName()).getPropertyByIndex(index));
			case 2:
				block = new BlockBirchLeaves();
				return block.setProperty(BlockSpruceLeaves.persistent.getName(), block.getProperty(BlockSpruceLeaves.persistent.getName()).getPropertyByIndex(index));
			case 3:
				block = new BlockJungleLeaves();
				return block.setProperty(BlockSpruceLeaves.persistent.getName(), block.getProperty(BlockSpruceLeaves.persistent.getName()).getPropertyByIndex(index));
			default:
				return new BlockOakLeaves().setProperty(persistent.getName(), persistent.getPropertyByIndex(index));
		}
	}

	@Override
	public Block getOldBlock() {
		Block block = new BlockOakLeaves();
		return block.setMetadata(setMetaBits(persistent.getCurrentIndex(), block.getProperty(persistent.getName()).getMetadataIndexBit()));
	}
}