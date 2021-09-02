package net.dugged.schematicconverter.block;

public class BlockPiston extends Block {
	protected static final BlockProperty extended = new BlockProperty("extended", new String[]{"false", "true"});
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"down", "up", "north", "south", "west", "east"});

	public BlockPiston() {
		super("piston");
		setOldId(33);
		setOldName("piston");
		extended.setMetadataIndexBit(3);
		extended.setMetadataBitCount(1);
		facing.setMetadataIndexBit(0);
		facing.setMetadataBitCount(3);
		blockProperties.add(extended);
		blockProperties.add(facing);
	}

	@Override
	public Block getNewBlock() {
		Block block = new BlockPiston().setProperty(facing.getName(), facing.getPropertyByIndex(getMetaBits(facing.getMetadataBitCount(), facing.getMetadataIndexBit())));
		return block.setProperty(extended.getName(), extended.getPropertyByIndex(getMetaBits(extended.getMetadataBitCount(), extended.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		Block block = new BlockPiston().setMetadata(setMetaBits(facing.getCurrentIndex(), facing.getMetadataIndexBit()));
		return block.setMetadata(block.setMetaBits(extended.getCurrentIndex(), extended.getMetadataIndexBit()));
	}
}