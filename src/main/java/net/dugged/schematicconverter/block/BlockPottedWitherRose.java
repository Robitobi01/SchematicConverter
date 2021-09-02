package net.dugged.schematicconverter.block;

public class BlockPottedWitherRose extends Block {
	public BlockPottedWitherRose() {
		super("potted_wither_rose");
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