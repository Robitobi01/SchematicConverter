package net.dugged.schematicconverter.block;

public class BlockLightningRod extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"down", "up", "north", "south", "west", "east"});
	protected static final BlockProperty powered = new BlockProperty("powered", new String[]{"false", "true"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockLightningRod() {
		super("lightning_rod");
		blockProperties.add(facing);
		blockProperties.add(powered);
		blockProperties.add(waterlogged);
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