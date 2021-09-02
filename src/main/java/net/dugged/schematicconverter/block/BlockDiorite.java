package net.dugged.schematicconverter.block;

public class BlockDiorite extends Block {
	public BlockDiorite() {
		super("diorite");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockStone().setMetadata(3);
	}
}