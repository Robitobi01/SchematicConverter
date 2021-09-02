package net.dugged.schematicconverter.block;

public class BlockGrayConcretePowder extends Block {
	public BlockGrayConcretePowder() {
		super("gray_concrete_powder");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteConcretePowder().setMetadata(7);
	}
}