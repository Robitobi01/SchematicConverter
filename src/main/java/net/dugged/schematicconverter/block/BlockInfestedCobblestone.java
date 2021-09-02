package net.dugged.schematicconverter.block;

public class BlockInfestedCobblestone extends Block {
	public BlockInfestedCobblestone() {
		super("infested_cobblestone");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	public Block getOldBlock() {
		return new BlockInfestedStoneBricks().setMetadata(1);
	}
}