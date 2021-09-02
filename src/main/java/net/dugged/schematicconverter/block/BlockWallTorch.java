package net.dugged.schematicconverter.block;

public class BlockWallTorch extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "south", "west", "east"});

	public BlockWallTorch() {
		super("wall_torch");
		blockProperties.add(facing);
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		switch (facing.getValue()) {
			case "south":
				return new BlockTorch().setMetadata(3);
			case "west":
				return new BlockTorch().setMetadata(2);
			case "east":
				return new BlockTorch().setMetadata(1);
			default:
				return new BlockTorch().setMetadata(4);
		}
	}
}