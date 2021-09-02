package net.dugged.schematicconverter.block;

public class BlockDeepslateRedstoneOre extends Block {
	protected static final BlockProperty lit = new BlockProperty("lit", new String[]{"false", "true"});

	public BlockDeepslateRedstoneOre() {
		super("deepslate_redstone_ore");
		blockProperties.add(lit);
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}