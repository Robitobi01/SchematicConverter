package net.dugged.schematicconverter.block;

public class BlockBedrock extends Block {
	public BlockBedrock() {
		super("bedrock");
		setOldId(7);
		setOldName("bedrock");
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