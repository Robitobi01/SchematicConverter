package net.dugged.schematicconverter.block;

public class BlockWaxedOxidizedCopper extends Block {
	public BlockWaxedOxidizedCopper() {
		super("waxed_oxidized_copper");
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