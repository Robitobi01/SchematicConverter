package net.dugged.schematicconverter.block;

public class BlockBirchPlanks extends Block {
	public BlockBirchPlanks() {
		super("birch_planks");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockOakPlanks().setMetadata(2);
	}
}