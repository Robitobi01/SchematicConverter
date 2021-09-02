package net.dugged.schematicconverter.block;

public class BlockHoneyBlock extends Block {
	public BlockHoneyBlock() {
		super("honey_block");
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