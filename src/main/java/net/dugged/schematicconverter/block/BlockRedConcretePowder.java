package net.dugged.schematicconverter.block;

public class BlockRedConcretePowder extends Block {
	public BlockRedConcretePowder() {
		super("red_concrete_powder");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteConcretePowder().setMetadata(14);
	}
}