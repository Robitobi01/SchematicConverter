package net.dugged.schematicconverter.block;

public class BlockGravel extends Block {
	public BlockGravel() {
		super("gravel");
		setOldId(13);
		setOldName("gravel");
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