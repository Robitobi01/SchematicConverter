package net.dugged.schematicconverter.block;

public class BlockLightGrayConcrete extends Block {
	public BlockLightGrayConcrete() {
		super("light_gray_concrete");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteConcrete().setMetadata(8);
	}
}