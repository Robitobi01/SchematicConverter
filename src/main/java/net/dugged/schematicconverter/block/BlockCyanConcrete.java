package net.dugged.schematicconverter.block;

public class BlockCyanConcrete extends Block {
	public BlockCyanConcrete() {
		super("cyan_concrete");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteConcrete().setMetadata(9);
	}
}