package net.dugged.schematicconverter.block;

public class BlockSmoker extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "south", "west", "east"});
	protected static final BlockProperty lit = new BlockProperty("lit", new String[]{"false", "true"});

	public BlockSmoker() {
		super("smoker");
		blockProperties.add(facing);
		blockProperties.add(lit);
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