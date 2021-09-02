package net.dugged.schematicconverter.block;

public class BlockOrangeConcrete extends Block {
	public BlockOrangeConcrete() {
		super("orange_concrete");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteConcrete().setMetadata(1);
	}
}