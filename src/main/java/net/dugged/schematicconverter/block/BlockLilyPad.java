package net.dugged.schematicconverter.block;

public class BlockLilyPad extends Block {
	public BlockLilyPad() {
		super("lily_pad");
		setOldId(111);
		setOldName("waterlily");
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