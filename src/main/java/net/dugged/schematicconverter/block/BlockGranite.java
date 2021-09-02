package net.dugged.schematicconverter.block;

public class BlockGranite extends Block {
	public BlockGranite() {
		super("granite");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockStone().setMetadata(1);
	}
}