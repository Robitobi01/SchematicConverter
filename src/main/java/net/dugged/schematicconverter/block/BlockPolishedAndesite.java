package net.dugged.schematicconverter.block;

public class BlockPolishedAndesite extends Block {
	public BlockPolishedAndesite() {
		super("polished_andesite");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockStone().setMetadata(6);
	}
}