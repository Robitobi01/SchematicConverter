package net.dugged.schematicconverter.block;

public class BlockChiseledRedSandstone extends Block {
	public BlockChiseledRedSandstone() {
		super("chiseled_red_sandstone");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockRedSandstone().setMetadata(1);
	}
}