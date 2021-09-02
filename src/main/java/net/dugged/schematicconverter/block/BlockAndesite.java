package net.dugged.schematicconverter.block;

public class BlockAndesite extends Block {
	public BlockAndesite() {
		super("andesite");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockStone().setMetadata(5);
	}
}