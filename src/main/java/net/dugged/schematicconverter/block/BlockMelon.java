package net.dugged.schematicconverter.block;

public class BlockMelon extends Block {
	public BlockMelon() {
		super("melon");
		setOldId(103);
		setOldName("melon_block");
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