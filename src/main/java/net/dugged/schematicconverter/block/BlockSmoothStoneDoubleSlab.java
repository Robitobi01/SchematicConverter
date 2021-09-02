package net.dugged.schematicconverter.block;

public class BlockSmoothStoneDoubleSlab extends Block {
	public BlockSmoothStoneDoubleSlab() {
		super("");
		setOldId(43);
		setOldName("double_stone_slab");
		setAsLegacy();
	}

	@Override
	public Block getNewBlock() {
		switch (getMetaBits(3, 0)) {
			case 1:
				return new BlockSandstoneSlab().setProperty(BlockSandstoneSlab.type.getName(), "double");
			case 2:
				return new BlockOakSlab().setProperty(BlockOakSlab.type.getName(), "double");
			case 3:
				return new BlockCobblestoneSlab().setProperty(BlockCobblestoneSlab.type.getName(), "double");
			case 4:
				return new BlockBrickSlab().setProperty(BlockBrickSlab.type.getName(), "double");
			case 5:
				return new BlockStoneBrickSlab().setProperty(BlockStoneBrickSlab.type.getName(), "double");
			case 6:
				return new BlockNetherBrickSlab().setProperty(BlockNetherBrickSlab.type.getName(), "double");
			case 7:
				return new BlockQuartzSlab().setProperty(BlockQuartzSlab.type.getName(), "double");
			default:
				return new BlockSmoothStoneSlab().setProperty(BlockSmoothStoneSlab.type.getName(), "double");
		}
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}
