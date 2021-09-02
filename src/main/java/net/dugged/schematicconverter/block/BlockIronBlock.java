package net.dugged.schematicconverter.block;

public class BlockIronBlock extends Block {
	public BlockIronBlock() {
		super("iron_block");
		setOldId(42);
		setOldName("iron_block");
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