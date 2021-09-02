package net.dugged.schematicconverter.block;

public class BlockPurpurBlock extends Block {
	public BlockPurpurBlock() {
		super("purpur_block");
		setOldId(201);
		setOldName("purpur_block");
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