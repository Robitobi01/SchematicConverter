package net.dugged.schematicconverter.block;

public class BlockPottedAcaciaSapling extends Block {
	public BlockPottedAcaciaSapling() {
		super("potted_acacia_sapling");
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