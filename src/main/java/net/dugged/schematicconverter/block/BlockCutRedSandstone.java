package net.dugged.schematicconverter.block;

public class BlockCutRedSandstone extends Block {
	public BlockCutRedSandstone() {
		super("cut_red_sandstone");
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