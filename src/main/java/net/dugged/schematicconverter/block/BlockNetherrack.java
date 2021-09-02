package net.dugged.schematicconverter.block;

public class BlockNetherrack extends Block {
	public BlockNetherrack() {
		super("netherrack");
		setOldId(87);
		setOldName("netherrack");
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