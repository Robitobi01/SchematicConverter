package net.dugged.schematicconverter.block;

public class BlockRedstoneTorch extends Block {
	protected static final BlockProperty lit = new BlockProperty("lit", new String[]{"false", "true"});

	public BlockRedstoneTorch() {
		super("redstone_torch");
		setOldId(76);
		setOldName("redstone_torch");
		blockProperties.add(lit);
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 1:
				return new BlockRedstoneWallTorch().setProperty(BlockRedstoneWallTorch.facing.getName(), "east").setProperty(lit.getName(), "true");
			case 2:
				return new BlockRedstoneWallTorch().setProperty(BlockRedstoneWallTorch.facing.getName(), "west").setProperty(lit.getName(), "true");
			case 3:
				return new BlockRedstoneWallTorch().setProperty(BlockRedstoneWallTorch.facing.getName(), "south").setProperty(lit.getName(), "true");
			case 4:
				return new BlockRedstoneWallTorch().setProperty(BlockRedstoneWallTorch.facing.getName(), "north").setProperty(lit.getName(), "true");
			default:
				return new BlockRedstoneTorch().setProperty(lit.getName(), "true");
		}
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}