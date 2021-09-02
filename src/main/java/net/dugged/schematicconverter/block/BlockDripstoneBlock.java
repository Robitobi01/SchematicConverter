package net.dugged.schematicconverter.block;

public class BlockDripstoneBlock extends Block {
	public BlockDripstoneBlock() {
		super("dripstone_block");
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