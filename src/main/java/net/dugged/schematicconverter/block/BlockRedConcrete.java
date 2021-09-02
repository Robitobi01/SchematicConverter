package net.dugged.schematicconverter.block;

public class BlockRedConcrete extends Block {
	public BlockRedConcrete() {
		super("red_concrete");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteConcrete().setMetadata(14);
	}
}