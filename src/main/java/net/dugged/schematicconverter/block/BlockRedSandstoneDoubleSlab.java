package net.dugged.schematicconverter.block;

public class BlockRedSandstoneDoubleSlab extends Block {

	public BlockRedSandstoneDoubleSlab() {
		super("");
		setOldId(181);
		setOldName("double_stone_slab2");
		setAsLegacy();
	}

	@Override
	public Block getNewBlock() {
		return new BlockRedSandstoneSlab().setProperty(BlockRedSandstoneSlab.type.getName(), "double");
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}