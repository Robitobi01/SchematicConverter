package net.dugged.schematicconverter.block;

public class BlockCrackedDeepslateBricks extends Block {
	public BlockCrackedDeepslateBricks() {
		super("cracked_deepslate_bricks");
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