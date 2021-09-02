package net.dugged.schematicconverter.block;

public class BlockFlowingLava extends Block {

	public BlockFlowingLava() {
		super("");
		setOldId(10);
		setOldName("flowing_lava");
		setAsLegacy();
	}

	@Override
	public Block getNewBlock() {
		return new BlockLava();
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}
