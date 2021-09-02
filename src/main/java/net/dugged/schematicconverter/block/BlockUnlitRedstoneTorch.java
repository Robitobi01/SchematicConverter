package net.dugged.schematicconverter.block;

public class BlockUnlitRedstoneTorch extends Block {

	public BlockUnlitRedstoneTorch() {
		super("");
		setOldId(75);
		setOldName("unlit_redstone_torch");
		setAsLegacy();
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 1:
				return new BlockRedstoneWallTorch().setProperty(BlockRedstoneWallTorch.facing.getName(), "east");
			case 2:
				return new BlockRedstoneWallTorch().setProperty(BlockRedstoneWallTorch.facing.getName(), "west");
			case 3:
				return new BlockRedstoneWallTorch().setProperty(BlockRedstoneWallTorch.facing.getName(), "south");
			case 4:
				return new BlockRedstoneWallTorch().setProperty(BlockRedstoneWallTorch.facing.getName(), "north");
			default:
				return this;
		}
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}