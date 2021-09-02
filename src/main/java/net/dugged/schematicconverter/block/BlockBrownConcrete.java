package net.dugged.schematicconverter.block;

public class BlockBrownConcrete extends Block {
	public BlockBrownConcrete() {
		super("brown_concrete");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteConcrete().setMetadata(12);
	}
}