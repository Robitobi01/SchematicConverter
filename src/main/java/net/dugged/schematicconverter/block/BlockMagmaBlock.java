package net.dugged.schematicconverter.block;

public class BlockMagmaBlock extends Block {
	public BlockMagmaBlock() {
		super("magma_block");
		setOldId(213);
		setOldName("magma");
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