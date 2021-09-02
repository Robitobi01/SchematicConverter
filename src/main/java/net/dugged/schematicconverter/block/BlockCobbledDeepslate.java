package net.dugged.schematicconverter.block;

public class BlockCobbledDeepslate extends Block {
	public BlockCobbledDeepslate() {
		super("cobbled_deepslate");
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