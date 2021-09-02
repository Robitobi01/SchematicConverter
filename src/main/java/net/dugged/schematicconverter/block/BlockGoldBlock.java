package net.dugged.schematicconverter.block;

public class BlockGoldBlock extends Block {
	public BlockGoldBlock() {
		super("gold_block");
		setOldId(41);
		setOldName("gold_block");
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