package net.dugged.schematicconverter.block;

public class BlockPodzol extends Block {
	protected static final BlockProperty snowy = new BlockProperty("snowy", new String[]{"false", "true"});

	public BlockPodzol() {
		super("podzol");
		blockProperties.add(snowy);
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockDirt().setMetadata(2);
	}
}