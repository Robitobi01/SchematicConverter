package net.dugged.schematicconverter.block;

public class BlockTuff extends Block {
	public BlockTuff() {
		super("tuff");
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