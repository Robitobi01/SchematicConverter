package net.dugged.schematicconverter.block;

public class BlockAmethystBlock extends Block {
	public BlockAmethystBlock() {
		super("amethyst_block");
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