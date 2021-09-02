package net.dugged.schematicconverter.block;

public class BlockRedBed extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"south", "west", "north", "east"});
	protected static final BlockProperty occupied = new BlockProperty("occupied", new String[]{"false", "true"});
	protected static final BlockProperty part = new BlockProperty("part", new String[]{"foot", "head"});

	public BlockRedBed() {
		super("red_bed");
		setOldId(26);
		setOldName("bed");
		facing.setMetadataIndexBit(0);
		facing.setMetadataBitCount(2);
		occupied.setMetadataIndexBit(2);
		occupied.setMetadataBitCount(1);
		part.setMetadataIndexBit(3);
		part.setMetadataBitCount(1);
		blockProperties.add(facing);
		blockProperties.add(occupied);
		blockProperties.add(part);
	}

	@Override
	public Block getNewBlock() {
		Block block = new BlockRedBed().setProperty(facing.getName(), facing.getPropertyByIndex(getMetaBits(facing.getMetadataBitCount(), facing.getMetadataIndexBit())));
		block = block.setProperty(occupied.getName(), occupied.getPropertyByIndex(getMetaBits(occupied.getMetadataBitCount(), occupied.getMetadataIndexBit())));
		return block.setProperty(part.getName(), part.getPropertyByIndex(getMetaBits(part.getMetadataBitCount(), part.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		Block block = new BlockRedBed().setMetadata(setMetaBits(facing.getCurrentIndex(), facing.getMetadataIndexBit()));
		block = block.setMetadata(block.setMetaBits(occupied.getCurrentIndex(), occupied.getMetadataIndexBit()));
		return block.setMetadata(block.setMetaBits(part.getCurrentIndex(), part.getMetadataIndexBit()));
	}
}