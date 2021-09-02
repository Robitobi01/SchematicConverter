package net.dugged.schematicconverter.block;

public class BlockLightGrayConcretePowder extends Block {
	public BlockLightGrayConcretePowder() {
		super("light_gray_concrete_powder");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteConcretePowder().setMetadata(8);
	}
}