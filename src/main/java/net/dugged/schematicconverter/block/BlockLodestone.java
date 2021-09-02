package net.dugged.schematicconverter.block;

public class BlockLodestone extends Block {
	public BlockLodestone() {
		super("lodestone");
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