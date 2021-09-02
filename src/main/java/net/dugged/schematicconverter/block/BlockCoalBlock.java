package net.dugged.schematicconverter.block;

public class BlockCoalBlock extends Block {
	public BlockCoalBlock() {
		super("coal_block");
		setOldId(173);
		setOldName("coal_block");
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