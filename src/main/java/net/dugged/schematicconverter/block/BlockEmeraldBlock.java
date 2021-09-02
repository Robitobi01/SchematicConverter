package net.dugged.schematicconverter.block;

public class BlockEmeraldBlock extends Block {
	public BlockEmeraldBlock() {
		super("emerald_block");
		setOldId(133);
		setOldName("emerald_block");
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