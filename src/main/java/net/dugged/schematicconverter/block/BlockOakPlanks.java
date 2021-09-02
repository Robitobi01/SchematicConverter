package net.dugged.schematicconverter.block;

public class BlockOakPlanks extends Block {
	public BlockOakPlanks() {
		super("oak_planks");
		setOldId(5);
		setOldName("planks");
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 1:
				return new BlockSprucePlanks();
			case 2:
				return new BlockBirchPlanks();
			case 3:
				return new BlockJunglePlanks();
			case 4:
				return new BlockAcaciaPlanks();
			case 5:
				return new BlockDarkOakPlanks();
			default:
				return new BlockOakPlanks();
		}
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}