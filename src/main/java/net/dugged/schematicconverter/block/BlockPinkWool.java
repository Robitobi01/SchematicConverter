package net.dugged.schematicconverter.block;

public class BlockPinkWool extends Block {
	public BlockPinkWool() {
		super("pink_wool");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteWool().setMetadata(6);
	}
}