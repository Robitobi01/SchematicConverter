package net.dugged.schematicconverter.block;

public class BlockOxidizedCutCopper extends Block {
	public BlockOxidizedCutCopper() {
		super("oxidized_cut_copper");
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