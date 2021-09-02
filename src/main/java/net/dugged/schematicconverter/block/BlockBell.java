package net.dugged.schematicconverter.block;

public class BlockBell extends Block {
	protected static final BlockProperty attachment = new BlockProperty("attachment", new String[]{"floor", "ceiling", "single_wall", "double_wall"});
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "south", "west", "east"});
	protected static final BlockProperty powered = new BlockProperty("powered", new String[]{"false", "true"});

	public BlockBell() {
		super("bell");
		blockProperties.add(attachment);
		blockProperties.add(facing);
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