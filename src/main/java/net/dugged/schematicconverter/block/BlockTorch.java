package net.dugged.schematicconverter.block;

public class BlockTorch extends Block {
	public BlockTorch() {
		super("torch");
		setOldId(50);
		setOldName("torch");
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 1:
				return new BlockWallTorch().setProperty(BlockWallTorch.facing.getName(), "east");
			case 2:
				return new BlockWallTorch().setProperty(BlockWallTorch.facing.getName(), "west");
			case 3:
				return new BlockWallTorch().setProperty(BlockWallTorch.facing.getName(), "south");
			case 4:
				return new BlockWallTorch().setProperty(BlockWallTorch.facing.getName(), "north");
			default:
				return this;
		}
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}