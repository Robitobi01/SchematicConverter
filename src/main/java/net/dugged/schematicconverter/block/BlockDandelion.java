package net.dugged.schematicconverter.block;

public class BlockDandelion extends Block {
	public BlockDandelion() {
		super("dandelion");
		setOldId(37);
		setOldName("yellow_flower");
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