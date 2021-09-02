package net.dugged.schematicconverter.block;

public class BlockSporeBlossom extends Block {
	public BlockSporeBlossom() {
		super("spore_blossom");
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