package net.dugged.schematicconverter.block;

public class BlockBeeNest extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "south", "west", "east"});
	protected static final BlockProperty honey_level = new BlockProperty("honey_level", new String[]{"0", "1", "2", "3", "4", "5"});

	public BlockBeeNest() {
		super("bee_nest");
		blockProperties.add(facing);
		blockProperties.add(honey_level);
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