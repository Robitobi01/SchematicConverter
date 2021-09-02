package net.dugged.schematicconverter.block;

public class BlockCalcite extends Block {
	public BlockCalcite() {
		super("calcite");
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