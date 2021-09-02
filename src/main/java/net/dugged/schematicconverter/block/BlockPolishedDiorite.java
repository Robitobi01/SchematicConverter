package net.dugged.schematicconverter.block;

public class BlockPolishedDiorite extends Block {
	public BlockPolishedDiorite() {
		super("polished_diorite");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockStone().setMetadata(4);
	}
}