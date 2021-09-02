package net.dugged.schematicconverter.block;

public class BlockPottedDeadBush extends Block {
	public BlockPottedDeadBush() {
		super("potted_dead_bush");
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