package net.dugged.schematicconverter.block;

public class BlockPolishedDeepslate extends Block {
	public BlockPolishedDeepslate() {
		super("polished_deepslate");
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