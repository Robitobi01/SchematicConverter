package net.dugged.schematicconverter.block;

public class BlockRedMushroom extends Block {
	public BlockRedMushroom() {
		super("red_mushroom");
		setOldId(40);
		setOldName("red_mushroom");
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