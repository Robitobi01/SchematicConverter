package net.dugged.schematicconverter.block;

public class BlockDeadBush extends Block {
	public BlockDeadBush() {
		super("dead_bush");
		setOldId(32);
		setOldName("deadbush");
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