package net.dugged.schematicconverter.block;

public class BlockLightBlueConcretePowder extends Block {
	public BlockLightBlueConcretePowder() {
		super("light_blue_concrete_powder");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteConcretePowder().setMetadata(3);
	}
}