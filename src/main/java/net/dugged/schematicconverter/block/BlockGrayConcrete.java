package net.dugged.schematicconverter.block;

public class BlockGrayConcrete extends Block {
	public BlockGrayConcrete() {
		super("gray_concrete");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteConcrete().setMetadata(7);
	}
}