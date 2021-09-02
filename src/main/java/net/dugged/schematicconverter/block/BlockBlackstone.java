package net.dugged.schematicconverter.block;

public class BlockBlackstone extends Block {
	public BlockBlackstone() {
		super("blackstone");
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