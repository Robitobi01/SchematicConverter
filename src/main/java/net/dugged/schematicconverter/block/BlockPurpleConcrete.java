package net.dugged.schematicconverter.block;

public class BlockPurpleConcrete extends Block {
	public BlockPurpleConcrete() {
		super("purple_concrete");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteConcrete().setMetadata(10);
	}
}