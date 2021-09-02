package net.dugged.schematicconverter.block;

public class BlockLimeConcretePowder extends Block {
	public BlockLimeConcretePowder() {
		super("lime_concrete_powder");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteConcretePowder().setMetadata(5);
	}
}