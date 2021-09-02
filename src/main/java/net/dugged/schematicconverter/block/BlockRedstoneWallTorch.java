package net.dugged.schematicconverter.block;

public class BlockRedstoneWallTorch extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "south", "west", "east"});
	protected static final BlockProperty lit = new BlockProperty("lit", new String[]{"false", "true"});

	public BlockRedstoneWallTorch() {
		super("redstone_wall_torch");
		blockProperties.add(facing);
		blockProperties.add(lit);
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		if (lit.getValue().equals("true")) {
			switch (facing.getValue()) {
				case "south":
					return new BlockRedstoneTorch().setMetadata(3);
				case "west":
					return new BlockRedstoneTorch().setMetadata(2);
				case "east":
					return new BlockRedstoneTorch().setMetadata(1);
				default:
					return new BlockRedstoneTorch().setMetadata(4);
			}
		} else {
			switch (facing.getValue()) {
				case "south":
					return new BlockUnlitRedstoneTorch().setMetadata(3);
				case "west":
					return new BlockUnlitRedstoneTorch().setMetadata(2);
				case "east":
					return new BlockUnlitRedstoneTorch().setMetadata(1);
				default:
					return new BlockUnlitRedstoneTorch().setMetadata(4);
			}
		}
	}
}