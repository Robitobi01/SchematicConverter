package net.dugged.schematicconverter.block;

public class BlockPinkConcretePowder extends Block {
	public BlockPinkConcretePowder() {
		super("pink_concrete_powder");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteConcretePowder().setMetadata(6);
	}
}