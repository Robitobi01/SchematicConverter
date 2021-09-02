package net.dugged.schematicconverter.block;

public class BlockBarrel extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"down", "up", "north", "south", "west", "east"});
	protected static final BlockProperty open = new BlockProperty("open", new String[]{"false", "true"});

	public BlockBarrel() {
		super("barrel");
		blockProperties.add(facing);
		blockProperties.add(open);
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