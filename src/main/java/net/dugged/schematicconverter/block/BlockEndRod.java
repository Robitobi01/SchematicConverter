package net.dugged.schematicconverter.block;

public class BlockEndRod extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"down", "up", "north", "south", "west", "east"});

	public BlockEndRod() {
		super("end_rod");
		setOldId(198);
		setOldName("end_rod");
		facing.setMetadataIndexBit(0);
		facing.setMetadataBitCount(3);
		blockProperties.add(facing);
	}

	@Override
	public Block getNewBlock() {
		return new BlockEndRod().setProperty(facing.getName(), facing.getPropertyByIndex(getMetaBits(facing.getMetadataBitCount(), facing.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		return new BlockEndRod().setMetadata(setMetaBits(facing.getCurrentIndex(), facing.getMetadataIndexBit()));
	}
}