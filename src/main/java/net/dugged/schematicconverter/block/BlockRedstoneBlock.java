package net.dugged.schematicconverter.block;

public class BlockRedstoneBlock extends Block {
	public BlockRedstoneBlock() {
		super("redstone_block");
		setOldId(152);
		setOldName("redstone_block");
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