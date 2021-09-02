package net.dugged.schematicconverter.block;

public class BlockBlackConcretePowder extends Block {
	public BlockBlackConcretePowder() {
		super("black_concrete_powder");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteConcretePowder().setMetadata(15);
	}
}