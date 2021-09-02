package net.dugged.schematicconverter.block;

public class BlockPolishedGranite extends Block {
	public BlockPolishedGranite() {
		super("polished_granite");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockStone().setMetadata(2);
	}
}