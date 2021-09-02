package net.dugged.schematicconverter.block;

public class BlockSnowBlock extends Block {
	public BlockSnowBlock() {
		super("snow_block");
		setOldId(80);
		setOldName("snow");
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