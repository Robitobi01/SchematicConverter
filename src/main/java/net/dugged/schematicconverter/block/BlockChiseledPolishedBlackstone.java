package net.dugged.schematicconverter.block;

public class BlockChiseledPolishedBlackstone extends Block {
	public BlockChiseledPolishedBlackstone() {
		super("chiseled_polished_blackstone");
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