package net.dugged.schematicconverter.block;

public class BlockMagentaWool extends Block {
	public BlockMagentaWool() {
		super("magenta_wool");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteWool().setMetadata(2);
	}
}