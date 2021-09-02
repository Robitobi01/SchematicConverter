package net.dugged.schematicconverter.block;

public class BlockGrindstone extends Block {
	protected static final BlockProperty face = new BlockProperty("face", new String[]{"floor", "wall", "ceiling"});
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "south", "west", "east"});

	public BlockGrindstone() {
		super("grindstone");
		blockProperties.add(face);
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