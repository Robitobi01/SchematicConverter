package net.dugged.schematicconverter.block;

public class BlockSoulTorch extends Block {
	public BlockSoulTorch() {
		super("soul_torch");
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