package net.dugged.schematicconverter.block;

public class BlockBarrier extends Block {
	public BlockBarrier() {
		super("barrier");
		setOldId(166);
		setOldName("barrier");
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