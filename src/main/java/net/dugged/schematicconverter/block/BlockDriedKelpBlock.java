package net.dugged.schematicconverter.block;

public class BlockDriedKelpBlock extends Block {
	public BlockDriedKelpBlock() {
		super("dried_kelp_block");
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