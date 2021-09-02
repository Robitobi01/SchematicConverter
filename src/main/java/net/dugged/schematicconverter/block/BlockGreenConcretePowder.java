package net.dugged.schematicconverter.block;

public class BlockGreenConcretePowder extends Block {
	public BlockGreenConcretePowder() {
		super("green_concrete_powder");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteConcretePowder().setMetadata(13);
	}
}