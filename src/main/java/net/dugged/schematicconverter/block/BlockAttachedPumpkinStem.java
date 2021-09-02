package net.dugged.schematicconverter.block;

public class BlockAttachedPumpkinStem extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "south", "west", "east"});

	public BlockAttachedPumpkinStem() {
		super("attached_pumpkin_stem");
		blockProperties.add(facing);
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