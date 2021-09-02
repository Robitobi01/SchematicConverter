package net.dugged.schematicconverter.block;

public class BlockCutCopper extends Block {
	public BlockCutCopper() {
		super("cut_copper");
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