package net.dugged.schematicconverter.block;

public class BlockSprucePlanks extends Block {
	public BlockSprucePlanks() {
		super("spruce_planks");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockOakPlanks().setMetadata(1);
	}
}