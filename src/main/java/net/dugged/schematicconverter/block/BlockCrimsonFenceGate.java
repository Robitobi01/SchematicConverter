package net.dugged.schematicconverter.block;

public class BlockCrimsonFenceGate extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"south", "west", "north", "east"});
	protected static final BlockProperty in_wall = new BlockProperty("in_wall", new String[]{"false", "true"});
	protected static final BlockProperty open = new BlockProperty("open", new String[]{"false", "true"});
	protected static final BlockProperty powered = new BlockProperty("powered", new String[]{"false", "true"});

	public BlockCrimsonFenceGate() {
		super("crimson_fence_gate");
		blockProperties.add(facing);
		blockProperties.add(in_wall);
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