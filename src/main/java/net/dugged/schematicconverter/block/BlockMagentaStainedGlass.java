package net.dugged.schematicconverter.block;

public class BlockMagentaStainedGlass extends Block {
	public BlockMagentaStainedGlass() {
		super("magenta_stained_glass");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteStainedGlass().setMetadata(2);
	}
}