package net.dugged.schematicconverter.block;

public class BlockDeepslateBricks extends Block {
	public BlockDeepslateBricks() {
		super("deepslate_bricks");
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