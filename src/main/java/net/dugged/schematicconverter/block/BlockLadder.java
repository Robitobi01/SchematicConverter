package net.dugged.schematicconverter.block;

public class BlockLadder extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "south", "west", "east"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockLadder() {
		super("ladder");
		setOldId(65);
		setOldName("ladder");
		blockProperties.add(facing);
		blockProperties.add(waterlogged);
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 3:
				return new BlockLadder().setProperty(facing.getName(), "south");
			case 4:
				return new BlockLadder().setProperty(facing.getName(), "west");
			case 5:
				return new BlockLadder().setProperty(facing.getName(), "east");
			default:
				return new BlockLadder().setProperty(facing.getName(), "north");
		}
	}

	@Override
	public Block getOldBlock() {
		switch (facing.getValue()) {
			case "south":
				return new BlockLadder().setMetadata(3);
			case "west":
				return new BlockLadder().setMetadata(4);
			case "east":
				return new BlockLadder().setMetadata(5);
			default:
				return new BlockLadder().setMetadata(2);
		}
	}
}