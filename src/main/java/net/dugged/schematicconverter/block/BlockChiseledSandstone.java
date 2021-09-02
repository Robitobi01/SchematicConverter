package net.dugged.schematicconverter.block;

public class BlockChiseledSandstone extends Block {
	public BlockChiseledSandstone() {
		super("chiseled_sandstone");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockSandstone().setMetadata(1);
	}
}