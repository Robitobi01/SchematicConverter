package net.dugged.schematicconverter.block;

public class BlockAcaciaLeaves extends Block {
	protected static final BlockProperty distance = new BlockProperty("distance", new String[]{"1", "2", "3", "4", "5", "6", "7"});
	protected static final BlockProperty persistent = new BlockProperty("persistent", new String[]{"false", "true"});

	public BlockAcaciaLeaves() {
		super("acacia_leaves");
		setOldId(161);
		setOldName("leaves2");
		persistent.setMetadataIndexBit(2);
		persistent.setMetadataBitCount(2);
		blockProperties.add(distance);
		blockProperties.add(persistent);
	}

	@Override
	public Block getNewBlock() {
		int index = getMetaBits(distance.getMetadataBitCount(), distance.getMetadataIndexBit());
		Block block;
		if (getMetaBits(2, 0) == 1) {
			block = new BlockDarkOakLeaves();
			return block.setProperty(BlockDarkOakLeaves.persistent.getName(), block.getProperty(BlockDarkOakLeaves.persistent.getName()).getPropertyByIndex(index));
		}
		return new BlockAcaciaLeaves().setProperty(persistent.getName(), persistent.getPropertyByIndex(index));
	}

	@Override
	public Block getOldBlock() {
		Block block = new BlockAcaciaLeaves();
		return block.setMetadata(setMetaBits(persistent.getCurrentIndex(), block.getProperty(persistent.getName()).getMetadataIndexBit()));
	}
}