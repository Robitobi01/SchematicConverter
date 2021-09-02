package net.dugged.schematicconverter.block;

public class BlockDeepslateTiles extends Block {
	public BlockDeepslateTiles() {
		super("deepslate_tiles");
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