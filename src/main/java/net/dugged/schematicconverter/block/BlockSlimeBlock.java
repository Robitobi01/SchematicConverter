package net.dugged.schematicconverter.block;

public class BlockSlimeBlock extends Block {
	public BlockSlimeBlock() {
		super("slime_block");
		setOldId(165);
		setOldName("slime");
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