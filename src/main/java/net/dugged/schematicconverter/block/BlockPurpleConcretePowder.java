package net.dugged.schematicconverter.block;

public class BlockPurpleConcretePowder extends Block {
	public BlockPurpleConcretePowder() {
		super("purple_concrete_powder");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteConcretePowder().setMetadata(10);
	}
}