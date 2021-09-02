package net.dugged.schematicconverter.block;

public class BlockPurpurDoubleSlab extends Block {

	public BlockPurpurDoubleSlab() {
		super("");
		setOldId(204);
		setOldName("purpur_slab");
		setAsLegacy();
	}

	@Override
	public Block getNewBlock() {
		return new BlockPurpurSlab().setProperty(BlockPurpurSlab.type.getName(), "double");
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}