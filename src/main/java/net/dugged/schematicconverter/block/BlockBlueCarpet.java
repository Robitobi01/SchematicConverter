package net.dugged.schematicconverter.block;

public class BlockBlueCarpet extends Block {
	public BlockBlueCarpet() {
		super("blue_carpet");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteCarpet().setMetadata(11);
	}
}