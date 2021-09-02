package net.dugged.schematicconverter.block;

public class BlockLapisBlock extends Block {
	public BlockLapisBlock() {
		super("lapis_block");
		setOldId(22);
		setOldName("lapis_block");
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