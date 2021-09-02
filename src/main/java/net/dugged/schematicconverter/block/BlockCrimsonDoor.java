package net.dugged.schematicconverter.block;

public class BlockCrimsonDoor extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"south", "west", "north", "east"});
	protected static final BlockProperty half = new BlockProperty("half", new String[]{"lower", "upper"});
	protected static final BlockProperty hinge = new BlockProperty("hinge", new String[]{"left", "right"});
	protected static final BlockProperty open = new BlockProperty("open", new String[]{"false", "true"});
	protected static final BlockProperty powered = new BlockProperty("powered", new String[]{"false", "true"});

	public BlockCrimsonDoor() {
		super("crimson_door");
		blockProperties.add(facing);
		blockProperties.add(half);
		blockProperties.add(hinge);
		blockProperties.add(open);
		blockProperties.add(powered);
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