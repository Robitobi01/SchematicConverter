package net.dugged.schematicconverter.block;

public class BlockJunglePlanks extends Block {
	public BlockJunglePlanks() {
		super("jungle_planks");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockOakPlanks().setMetadata(4);
	}
}