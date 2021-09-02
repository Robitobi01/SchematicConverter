package net.dugged.schematicconverter.block;

public class BlockGreenConcrete extends Block {
	public BlockGreenConcrete() {
		super("green_concrete");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteConcrete().setMetadata(13);
	}
}