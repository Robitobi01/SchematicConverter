package net.dugged.schematicconverter.block;

public class BlockBlueOrchid extends Block {
	public BlockBlueOrchid() {
		super("blue_orchid");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockPoppy().setMetadata(1);
	}
}