package net.dugged.schematicconverter.block;

public class BlockMagentaConcrete extends Block {
	public BlockMagentaConcrete() {
		super("magenta_concrete");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteConcrete().setMetadata(2);
	}
}