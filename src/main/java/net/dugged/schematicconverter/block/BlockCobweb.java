package net.dugged.schematicconverter.block;

public class BlockCobweb extends Block {
	public BlockCobweb() {
		super("cobweb");
		setOldId(30);
		setOldName("web");
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