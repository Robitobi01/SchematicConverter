package net.dugged.schematicconverter.block;

public class BlockOakStairs extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "south", "west", "east"});
	protected static final BlockProperty half = new BlockProperty("half", new String[]{"top", "bottom"});
	protected static final BlockProperty shape = new BlockProperty("shape", new String[]{"straight", "inner_left", "inner_right", "outer_left", "outer_right"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockOakStairs() {
		super("oak_stairs");
		setOldId(53);
		setOldName("oak_stairs");
		facing.setMetadataIndexBit(0);
		facing.setMetadataBitCount(2);
		half.setMetadataIndexBit(2);
		half.setMetadataBitCount(1);
		blockProperties.add(facing);
		blockProperties.add(half);
		blockProperties.add(shape);
		blockProperties.add(waterlogged);
	}

	@Override
	public Block getNewBlock() {
		Block block = new BlockOakStairs().setProperty(facing.getName(), facing.getPropertyByIndex(getMetaBits(facing.getMetadataBitCount(), facing.getMetadataIndexBit())));
		return block.setProperty(half.getName(), half.getPropertyByIndex(getMetaBits(half.getMetadataBitCount(), half.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		Block block = new BlockOakStairs().setMetadata(setMetaBits(facing.getCurrentIndex(), facing.getMetadataIndexBit()));
		return block.setMetadata(block.setMetaBits(half.getCurrentIndex(), half.getMetadataIndexBit()));
	}
}