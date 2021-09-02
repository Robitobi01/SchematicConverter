package net.dugged.schematicconverter.block;

public class BlockMagentaConcretePowder extends Block {
	public BlockMagentaConcretePowder() {
		super("magenta_concrete_powder");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteConcretePowder().setMetadata(2);
	}
}