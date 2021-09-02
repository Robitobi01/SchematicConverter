package net.dugged.schematicconverter.block;

public class BlockBlueConcrete extends Block {
	public BlockBlueConcrete() {
		super("blue_concrete");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteConcrete().setMetadata(11);
	}
}