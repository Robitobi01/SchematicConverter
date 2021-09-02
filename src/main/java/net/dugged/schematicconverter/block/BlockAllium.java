package net.dugged.schematicconverter.block;

public class BlockAllium extends Block {
	public BlockAllium() {
		super("allium");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockPoppy().setMetadata(2);
	}
}