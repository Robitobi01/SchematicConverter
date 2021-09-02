package net.dugged.schematicconverter.block;

public class BlockDiamondBlock extends Block {
	public BlockDiamondBlock() {
		super("diamond_block");
		setOldId(57);
		setOldName("diamond_block");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}