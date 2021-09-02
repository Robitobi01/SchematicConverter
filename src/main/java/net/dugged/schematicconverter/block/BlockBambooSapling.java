package net.dugged.schematicconverter.block;

public class BlockBambooSapling extends Block {
	public BlockBambooSapling() {
		super("bamboo_sapling");
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