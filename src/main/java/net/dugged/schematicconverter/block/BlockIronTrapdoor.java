package net.dugged.schematicconverter.block;

public class BlockIronTrapdoor extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "south", "west", "east"});
	protected static final BlockProperty half = new BlockProperty("half", new String[]{"top", "bottom"});
	protected static final BlockProperty open = new BlockProperty("open", new String[]{"false", "true"});
	protected static final BlockProperty powered = new BlockProperty("powered", new String[]{"false", "true"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockIronTrapdoor() {
		super("iron_trapdoor");
		setOldId(167);
		setOldName("iron_trapdoor");
		facing.setMetadataIndexBit(0);
		facing.setMetadataBitCount(2);
		open.setMetadataIndexBit(2);
		open.setMetadataBitCount(1);
		half.setMetadataIndexBit(3);
		half.setMetadataBitCount(1);
		blockProperties.add(facing);
		blockProperties.add(half);
		blockProperties.add(open);
		blockProperties.add(powered);
		blockProperties.add(waterlogged);
	}

	@Override
	public Block getNewBlock() {
		Block block = new BlockObserver().setProperty(facing.getName(), facing.getPropertyByIndex(getMetaBits(facing.getMetadataBitCount(), facing.getMetadataIndexBit())));
		block = block.setProperty(open.getName(), open.getPropertyByIndex(getMetaBits(open.getMetadataBitCount(), open.getMetadataIndexBit())));
		return block.setProperty(powered.getName(), powered.getPropertyByIndex(getMetaBits(powered.getMetadataBitCount(), powered.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		Block block = new BlockObserver().setMetadata(setMetaBits(facing.getCurrentIndex(), facing.getMetadataIndexBit()));
		block = block.setMetadata(block.setMetaBits(open.getCurrentIndex(), open.getMetadataIndexBit()));
		return block.setMetadata(block.setMetaBits(powered.getCurrentIndex(), powered.getMetadataIndexBit()));
	}
}