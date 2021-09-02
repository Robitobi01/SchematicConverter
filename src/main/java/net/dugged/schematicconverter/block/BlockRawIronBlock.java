package net.dugged.schematicconverter.block;

public class BlockRawIronBlock extends Block {
	public BlockRawIronBlock() {
		super("raw_iron_block");
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