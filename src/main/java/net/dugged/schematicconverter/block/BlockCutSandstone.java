package net.dugged.schematicconverter.block;

public class BlockCutSandstone extends Block {
	public BlockCutSandstone() {
		super("cut_sandstone");
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