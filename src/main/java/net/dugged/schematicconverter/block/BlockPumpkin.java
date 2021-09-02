package net.dugged.schematicconverter.block;

public class BlockPumpkin extends Block {
	public BlockPumpkin() {
		super("pumpkin");
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