package net.dugged.schematicconverter.block;

public class BlockAcaciaPlanks extends Block {
	public BlockAcaciaPlanks() {
		super("acacia_planks");
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