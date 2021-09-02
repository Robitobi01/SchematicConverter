package net.dugged.schematicconverter.block;

public class BlockWarpedWartBlock extends Block {
	public BlockWarpedWartBlock() {
		super("warped_wart_block");
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