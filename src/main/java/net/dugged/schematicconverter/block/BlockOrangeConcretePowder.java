package net.dugged.schematicconverter.block;

public class BlockOrangeConcretePowder extends Block {
	public BlockOrangeConcretePowder() {
		super("orange_concrete_powder");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteConcretePowder().setMetadata(1);
	}
}