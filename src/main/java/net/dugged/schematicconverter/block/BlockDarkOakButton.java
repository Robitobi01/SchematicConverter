package net.dugged.schematicconverter.block;

public class BlockDarkOakButton extends Block {
	protected static final BlockProperty face = new BlockProperty("face", new String[]{"floor", "wall", "ceiling"});
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "south", "west", "east"});
	protected static final BlockProperty powered = new BlockProperty("powered", new String[]{"false", "true"});

	public BlockDarkOakButton() {
		super("dark_oak_button");
		blockProperties.add(face);
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