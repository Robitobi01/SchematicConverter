package net.dugged.schematicconverter.block;

public class BlockStonecutter extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "south", "west", "east"});

	public BlockStonecutter() {
		super("stonecutter");
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