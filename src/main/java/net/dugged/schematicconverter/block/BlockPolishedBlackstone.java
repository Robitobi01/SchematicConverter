package net.dugged.schematicconverter.block;

public class BlockPolishedBlackstone extends Block {
	public BlockPolishedBlackstone() {
		super("polished_blackstone");
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