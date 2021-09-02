package net.dugged.schematicconverter.block;

public class BlockFloweringAzaleaLeaves extends Block {
	protected static final BlockProperty distance = new BlockProperty("distance", new String[]{"1", "2", "3", "4", "5", "6", "7"});
	protected static final BlockProperty persistent = new BlockProperty("persistent", new String[]{"false", "true"});

	public BlockFloweringAzaleaLeaves() {
		super("flowering_azalea_leaves");
		blockProperties.add(distance);
		blockProperties.add(persistent);
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}