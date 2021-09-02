package net.dugged.schematicconverter.block;

public class BlockDragonEgg extends Block {
	public BlockDragonEgg() {
		super("dragon_egg");
		setOldId(122);
		setOldName("dragon_egg");
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