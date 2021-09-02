package net.dugged.schematicconverter.block;

public class BlockYellowBed extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"south", "west", "north", "east"});
	protected static final BlockProperty occupied = new BlockProperty("occupied", new String[]{"false", "true"});
	protected static final BlockProperty part = new BlockProperty("part", new String[]{"foot", "head"});

	public BlockYellowBed() {
		super("yellow_bed");
		blockProperties.add(facing);
		blockProperties.add(occupied);
		blockProperties.add(part);
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		Block block = new BlockRedBed().setProperty(BlockRedBed.facing.getName(), facing.getValue());
		block.setProperty(BlockRedBed.occupied.getName(), occupied.getValue());
		return block.setProperty(BlockRedBed.part.getName(), part.getValue());
	}
}