package net.dugged.schematicconverter.block;

public class BlockYellowConcrete extends Block {
	public BlockYellowConcrete() {
		super("yellow_concrete");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteConcrete().setMetadata(4);
	}
}