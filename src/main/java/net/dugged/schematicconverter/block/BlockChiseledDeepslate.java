package net.dugged.schematicconverter.block;

public class BlockChiseledDeepslate extends Block {
	public BlockChiseledDeepslate() {
		super("chiseled_deepslate");
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