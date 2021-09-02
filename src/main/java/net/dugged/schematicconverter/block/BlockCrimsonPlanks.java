package net.dugged.schematicconverter.block;

public class BlockCrimsonPlanks extends Block {
	public BlockCrimsonPlanks() {
		super("crimson_planks");
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