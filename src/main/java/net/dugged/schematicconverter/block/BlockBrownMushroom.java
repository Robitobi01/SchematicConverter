package net.dugged.schematicconverter.block;

public class BlockBrownMushroom extends Block {
	public BlockBrownMushroom() {
		super("brown_mushroom");
		setOldId(39);
		setOldName("brown_mushroom");
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