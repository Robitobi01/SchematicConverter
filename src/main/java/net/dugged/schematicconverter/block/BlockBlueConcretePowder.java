package net.dugged.schematicconverter.block;

public class BlockBlueConcretePowder extends Block {
	public BlockBlueConcretePowder() {
		super("blue_concrete_powder");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteConcretePowder().setMetadata(11);
	}
}