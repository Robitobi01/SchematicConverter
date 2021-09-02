package net.dugged.schematicconverter.block;

public class BlockCrackedDeepslateTiles extends Block {
	public BlockCrackedDeepslateTiles() {
		super("cracked_deepslate_tiles");
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