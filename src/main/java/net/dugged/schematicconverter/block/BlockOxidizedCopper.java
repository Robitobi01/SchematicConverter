package net.dugged.schematicconverter.block;

public class BlockOxidizedCopper extends Block {
	public BlockOxidizedCopper() {
		super("oxidized_copper");
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