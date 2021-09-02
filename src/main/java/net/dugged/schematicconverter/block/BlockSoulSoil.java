package net.dugged.schematicconverter.block;

public class BlockSoulSoil extends Block {
	public BlockSoulSoil() {
		super("soul_soil");
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