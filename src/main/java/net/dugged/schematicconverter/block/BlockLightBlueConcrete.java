package net.dugged.schematicconverter.block;

public class BlockLightBlueConcrete extends Block {
	public BlockLightBlueConcrete() {
		super("light_blue_concrete");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteConcrete().setMetadata(3);
	}
}