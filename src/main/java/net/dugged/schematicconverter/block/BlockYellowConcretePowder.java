package net.dugged.schematicconverter.block;

public class BlockYellowConcretePowder extends Block {
	public BlockYellowConcretePowder() {
		super("yellow_concrete_powder");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteConcretePowder().setMetadata(4);
	}
}