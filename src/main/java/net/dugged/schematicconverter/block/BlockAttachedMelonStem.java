package net.dugged.schematicconverter.block;

public class BlockAttachedMelonStem extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "south", "west", "east"});

	public BlockAttachedMelonStem() {
		super("attached_melon_stem");
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