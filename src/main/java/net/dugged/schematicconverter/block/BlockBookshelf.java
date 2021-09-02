package net.dugged.schematicconverter.block;

public class BlockBookshelf extends Block {
	public BlockBookshelf() {
		super("bookshelf");
		setOldId(47);
		setOldName("bookshelf");
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