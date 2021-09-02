package net.dugged.schematicconverter.block;

public class BlockPinkConcrete extends Block {
	public BlockPinkConcrete() {
		super("pink_concrete");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteConcrete().setMetadata(6);
	}
}