package net.dugged.schematicconverter.block;

public class BlockComparator extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "south", "west", "east"});
	protected static final BlockProperty mode = new BlockProperty("mode", new String[]{"compare", "subtract"});
	protected static final BlockProperty powered = new BlockProperty("powered", new String[]{"false", "true"});

	public BlockComparator() {
		super("comparator");
		setOldId(150);
		setOldName("powered_comparator");
		facing.setMetadataIndexBit(0);
		facing.setMetadataBitCount(2);
		mode.setMetadataIndexBit(2);
		mode.setMetadataBitCount(1);
		blockProperties.add(facing);
		blockProperties.add(mode);
		blockProperties.add(powered);
	}

	@Override
	public Block getNewBlock() {
		Block block = new BlockComparator().setProperty(facing.getName(), facing.getPropertyByIndex(getMetaBits(facing.getMetadataBitCount(), facing.getMetadataIndexBit())));
		block = block.setProperty(powered.getName(), "true");
		return block.setProperty(mode.getName(), mode.getPropertyByIndex(getMetaBits(mode.getMetadataBitCount(), mode.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		if (powered.getValue().equals("true")) {
			Block block = new BlockComparator().setMetadata(setMetaBits(facing.getCurrentIndex(), facing.getMetadataIndexBit()));
			return block.setMetadata(block.setMetaBits(mode.getCurrentIndex(), mode.getMetadataIndexBit()));
		} else {
			Block block = new BlockUnpoweredComparator().setMetadata(setMetaBits(facing.getCurrentIndex(), facing.getMetadataIndexBit()));
			return block.setMetadata(block.setMetaBits(mode.getCurrentIndex(), mode.getMetadataIndexBit()));
		}
	}
}