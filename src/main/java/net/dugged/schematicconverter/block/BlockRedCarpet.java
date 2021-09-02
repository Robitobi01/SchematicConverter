package net.dugged.schematicconverter.block;

public class BlockRedCarpet extends Block {
	public BlockRedCarpet() {
		super("red_carpet");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteCarpet().setMetadata(14);
	}
}