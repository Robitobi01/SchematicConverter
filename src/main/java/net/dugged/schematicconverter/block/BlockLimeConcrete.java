package net.dugged.schematicconverter.block;

public class BlockLimeConcrete extends Block {
	public BlockLimeConcrete() {
		super("lime_concrete");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteConcrete().setMetadata(5);
	}
}