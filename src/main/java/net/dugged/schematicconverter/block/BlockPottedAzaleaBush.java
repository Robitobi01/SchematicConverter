package net.dugged.schematicconverter.block;

public class BlockPottedAzaleaBush extends Block {
	public BlockPottedAzaleaBush() {
		super("potted_azalea_bush");
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