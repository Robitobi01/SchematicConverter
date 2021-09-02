package net.dugged.schematicconverter.block;

public class BlockPinkCarpet extends Block {
	public BlockPinkCarpet() {
		super("pink_carpet");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteCarpet().setMetadata(6);
	}
}