package net.dugged.schematicconverter.block;

public class BlockCyanConcretePowder extends Block {
	public BlockCyanConcretePowder() {
		super("cyan_concrete_powder");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteConcretePowder().setMetadata(9);
	}
}