package net.dugged.schematicconverter.block;

public class BlockDoubleOakSlab extends Block {

	public BlockDoubleOakSlab() {
		super("");
		setOldId(125);
		setOldName("double_wooden_slab");
		setAsLegacy();
	}

	@Override
	public Block getNewBlock() {
		switch (getMetaBits(3, 0)) {
			case 1:
				return new BlockSpruceSlab().setProperty(BlockSpruceSlab.type.getName(), "double");
			case 2:
				return new BlockBirchSlab().setProperty(BlockBirchSlab.type.getName(), "double");
			case 3:
				return new BlockJungleSlab().setProperty(BlockJungleSlab.type.getName(), "double");
			case 4:
				return new BlockAcaciaSlab().setProperty(BlockAcaciaSlab.type.getName(), "double");
			case 5:
				return new BlockDarkOakSlab().setProperty(BlockDarkOakSlab.type.getName(), "double");
			default:
				return new BlockOakSlab().setProperty(BlockOakSlab.type.getName(), "double");
		}
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}