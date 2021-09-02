package net.dugged.schematicconverter.block;

public class BlockLever extends Block {
	protected static final BlockProperty face = new BlockProperty("face", new String[]{"floor", "wall", "ceiling"});
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "south", "west", "east"});
	protected static final BlockProperty powered = new BlockProperty("powered", new String[]{"false", "true"});

	public BlockLever() {
		super("lever");
		setOldId(69);
		setOldName("lever");
		facing.setMetadataIndexBit(0);
		facing.setMetadataBitCount(3);
		powered.setMetadataIndexBit(3);
		powered.setMetadataBitCount(1);
		blockProperties.add(face);
		blockProperties.add(facing);
		blockProperties.add(powered);
	}

	@Override
	public Block getNewBlock() {
		Block block = new BlockLever().setProperty(powered.getName(), facing.getPropertyByIndex(getMetaBits(powered.getMetadataIndexBit(), powered.getMetadataBitCount())));
		switch (metadata) {
			case 1:
				return block.setProperty(face.getName(), "wall").setProperty(facing.getName(), "east");
			case 2:
				return block.setProperty(face.getName(), "wall").setProperty(facing.getName(), "west");
			case 3:
				return block.setProperty(face.getName(), "wall").setProperty(facing.getName(), "south");
			case 4:
				return block.setProperty(face.getName(), "wall").setProperty(facing.getName(), "north");
			case 5:
			case 6:
				return block.setProperty(face.getName(), "ceiling").setProperty(facing.getName(), "east");
			default:
				return block.setProperty(face.getName(), "floor").setProperty(facing.getName(), "east");
		}
	}

	@Override
	public Block getOldBlock() {
		Block block = new BlockLever().setMetadata(setMetaBits(powered.getMetadataBitCount(), powered.getMetadataIndexBit()));

		if (face.getValue().equals("ceiling")) {
			return block.setMetadata(block.setMetaBits(5, facing.getMetadataIndexBit()));
		} else if (facing.getValue().equals("east")) {
			return block.setMetadata(block.setMetaBits(4, facing.getMetadataIndexBit()));
		} else if (facing.getValue().equals("west")) {
			return block.setMetadata(block.setMetaBits(3, facing.getMetadataIndexBit()));
		} else if (facing.getValue().equals("south")) {
			return block.setMetadata(block.setMetaBits(2, facing.getMetadataIndexBit()));
		} else if (facing.getValue().equals("north")) {
			return block.setMetadata(block.setMetaBits(1, facing.getMetadataIndexBit()));
		} else {
			return block.setMetadata(block.setMetaBits(0, facing.getMetadataIndexBit()));
		}
	}
}