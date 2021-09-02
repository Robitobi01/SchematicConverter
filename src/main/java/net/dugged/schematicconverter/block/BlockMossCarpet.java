package net.dugged.schematicconverter.block;

public class BlockMossCarpet extends Block {
	public BlockMossCarpet() {
		super("moss_carpet");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}