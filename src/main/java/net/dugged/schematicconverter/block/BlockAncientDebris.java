package net.dugged.schematicconverter.block;

public class BlockAncientDebris extends Block {
	public BlockAncientDebris() {
		super("ancient_debris");
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