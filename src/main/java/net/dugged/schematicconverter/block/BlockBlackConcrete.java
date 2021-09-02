package net.dugged.schematicconverter.block;

public class BlockBlackConcrete extends Block {
	public BlockBlackConcrete() {
		super("black_concrete");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteConcrete().setMetadata(15);
	}
}