package net.dugged.schematicconverter.block;

public class BlockJungleDoor extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"south", "west", "north", "east"});
	protected static final BlockProperty half = new BlockProperty("half", new String[]{"lower", "upper"});
	protected static final BlockProperty hinge = new BlockProperty("hinge", new String[]{"left", "right"});
	protected static final BlockProperty open = new BlockProperty("open", new String[]{"false", "true"});
	protected static final BlockProperty powered = new BlockProperty("powered", new String[]{"false", "true"});

	public BlockJungleDoor() {
		super("jungle_door");
		setOldId(195);
		setOldName("jungle_door");
		facing.setMetadataIndexBit(0);
		facing.setMetadataBitCount(2);
		open.setMetadataIndexBit(2);
		open.setMetadataBitCount(1);
		blockProperties.add(facing);
		blockProperties.add(half);
		blockProperties.add(hinge);
		blockProperties.add(open);
		blockProperties.add(powered);
	}

	@Override
	public Block getNewBlock() {
		Block block = new BlockJungleDoor().setProperty(facing.getName(), facing.getPropertyByIndex(getMetaBits(facing.getMetadataBitCount(), facing.getMetadataIndexBit())));
		block = block.setProperty(open.getName(), open.getPropertyByIndex(getMetaBits(open.getMetadataBitCount(), open.getMetadataIndexBit())));
		if (metadata == 8) {
			block = new BlockJungleDoor().setProperty(half.getName(), "upper").setProperty(hinge.getName(), "left");
		} else if (metadata == 9) {
			block = new BlockJungleDoor().setProperty(half.getName(), "upper").setProperty(hinge.getName(), "right");
		}
		return block;
	}

	@Override
	public Block getOldBlock() {
		Block block = new BlockJungleDoor().setMetadata(setMetaBits(facing.getCurrentIndex(), facing.getMetadataIndexBit()));
		block = block.setMetadata(block.setMetaBits(open.getCurrentIndex(), open.getMetadataIndexBit()));
		if (half.getValue().equals("upper")) {
			if (hinge.getValue().equals("right")) {
				block = new BlockJungleDoor().setMetadata(9);
			} else {
				block = new BlockJungleDoor().setMetadata(8);
			}
		}
		return block;
	}
}