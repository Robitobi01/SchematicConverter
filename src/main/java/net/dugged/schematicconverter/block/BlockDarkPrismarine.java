package net.dugged.schematicconverter.block;

public class BlockDarkPrismarine extends Block {
	public BlockDarkPrismarine() {
		super("dark_prismarine");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockPrismarine().setMetadata(1);
	}
}