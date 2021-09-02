package net.dugged.schematicconverter.block;

public class BlockPottedBlueOrchid extends Block {
	public BlockPottedBlueOrchid() {
		super("potted_blue_orchid");
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