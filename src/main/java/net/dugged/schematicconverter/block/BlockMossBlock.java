package net.dugged.schematicconverter.block;

public class BlockMossBlock extends Block {
	public BlockMossBlock() {
		super("moss_block");
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