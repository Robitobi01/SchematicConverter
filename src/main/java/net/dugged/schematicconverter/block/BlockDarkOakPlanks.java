package net.dugged.schematicconverter.block;

public class BlockDarkOakPlanks extends Block {
	public BlockDarkOakPlanks() {
		super("dark_oak_planks");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockOakPlanks().setMetadata(5);
	}
}