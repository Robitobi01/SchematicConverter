package net.dugged.schematicconverter.block;

public class BlockMagentaCarpet extends Block {
	public BlockMagentaCarpet() {
		super("magenta_carpet");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteCarpet().setMetadata(2);
	}
}