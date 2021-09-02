package net.dugged.schematicconverter.block;

public class BlockFurnace extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "south", "west", "east"});
	protected static final BlockProperty lit = new BlockProperty("lit", new String[]{"false", "true"});

	public BlockFurnace() {
		super("furnace");
		setOldId(61);
		setOldName("furnace");
		blockProperties.add(facing);
		blockProperties.add(lit);
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 3:
				return new BlockFurnace().setProperty(BlockFurnace.facing.getName(), "south");
			case 4:
				return new BlockFurnace().setProperty(BlockFurnace.facing.getName(), "west");
			case 5:
				return new BlockFurnace().setProperty(BlockFurnace.facing.getName(), "east");
			default:
				return new BlockFurnace().setProperty(BlockFurnace.facing.getName(), "north");
		}
	}

	@Override
	public Block getOldBlock() {
		if (lit.getValue().equals("true")) {
			switch (facing.getValue()) {
				case "south":
					return new BlockLitFurnace().setMetadata(3);
				case "west":
					return new BlockLitFurnace().setMetadata(4);
				case "east":
					return new BlockLitFurnace().setMetadata(5);
				default:
					return new BlockLitFurnace().setMetadata(2);
			}
		} else {
			switch (facing.getValue()) {
				case "south":
					return new BlockFurnace().setMetadata(3);
				case "west":
					return new BlockFurnace().setMetadata(4);
				case "east":
					return new BlockFurnace().setMetadata(5);
				default:
					return new BlockFurnace().setMetadata(2);
			}
		}
	}
}