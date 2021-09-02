package net.dugged.schematicconverter.block;

public class BlockMovingPiston extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"down", "up", "north", "south", "west", "east"});
	protected static final BlockProperty type = new BlockProperty("type", new String[]{"normal", "sticky"});

	public BlockMovingPiston() {
		super("moving_piston");
		setOldId(36);
		setOldName("piston_extension");
		blockProperties.add(facing);
		blockProperties.add(type);
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