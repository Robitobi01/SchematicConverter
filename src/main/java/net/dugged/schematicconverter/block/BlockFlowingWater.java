package net.dugged.schematicconverter.block;

public class BlockFlowingWater extends Block {
	public BlockFlowingWater() {
		super("");
		setOldId(8);
		setOldName("flowing_water");
		setAsLegacy();
	}

	@Override
	public Block getNewBlock() {
		return new BlockWater();
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}
