package net.dugged.schematicconverter.block;

public class BlockLectern extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "south", "west", "east"});
	protected static final BlockProperty has_book = new BlockProperty("has_book", new String[]{"false", "true"});
	protected static final BlockProperty powered = new BlockProperty("powered", new String[]{"false", "true"});

	public BlockLectern() {
		super("lectern");
		blockProperties.add(facing);
		blockProperties.add(has_book);
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