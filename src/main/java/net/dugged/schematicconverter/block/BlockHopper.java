package net.dugged.schematicconverter.block;

public class BlockHopper extends Block {
	protected static final BlockProperty enabled = new BlockProperty("enabled", new String[]{"false", "true"});
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"down", "north", "south", "west", "east"});

	public BlockHopper() {
		super("hopper");
		setOldId(154);
		setOldName("hopper");
		enabled.setMetadataIndexBit(3);
		enabled.setMetadataBitCount(1);
		facing.setMetadataIndexBit(0);
		facing.setMetadataBitCount(3);
		blockProperties.add(enabled);
		blockProperties.add(facing);
	}

	@Override
	public Block getNewBlock() {
		int index = getMetaBits(enabled.getMetadataBitCount(), enabled.getMetadataIndexBit());
		switch (getMetaBits(facing.getMetadataBitCount(), facing.getMetadataIndexBit())) {
			case 2:
				return new BlockHopper().setProperty(facing.getName(), "north").setProperty(enabled.getName(), enabled.getPropertyByIndex(index));
			case 3:
				return new BlockHopper().setProperty(facing.getName(), "south").setProperty(enabled.getName(), enabled.getPropertyByIndex(index));
			case 4:
				return new BlockHopper().setProperty(facing.getName(), "west").setProperty(enabled.getName(), enabled.getPropertyByIndex(index));
			case 5:
				return new BlockHopper().setProperty(facing.getName(), "east").setProperty(enabled.getName(), enabled.getPropertyByIndex(index));
			default:
				return new BlockHopper().setProperty(facing.getName(), "down").setProperty(enabled.getName(), enabled.getPropertyByIndex(index));
		}
	}

	@Override
	public Block getOldBlock() {
		switch (getProperty(facing.getName()).getValue()) {
			case "north":
				return new BlockHopper().setMetadata(setMetaBits(2, getProperty(enabled.getName()).getCurrentIndex(), enabled.getMetadataIndexBit()));
			case "south":
				return new BlockHopper().setMetadata(setMetaBits(3, getProperty(enabled.getName()).getCurrentIndex(), enabled.getMetadataIndexBit()));
			case "west":
				return new BlockHopper().setMetadata(setMetaBits(4, getProperty(enabled.getName()).getCurrentIndex(), enabled.getMetadataIndexBit()));
			case "east":
				return new BlockHopper().setMetadata(setMetaBits(5, getProperty(enabled.getName()).getCurrentIndex(), enabled.getMetadataIndexBit()));
			default:
				return new BlockHopper().setMetadata(setMetaBits(getProperty(enabled.getName()).getCurrentIndex(), enabled.getMetadataIndexBit()));
		}
	}
}