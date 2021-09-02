package net.dugged.schematicconverter.block;

public class BlockRedstoneOre extends Block {
	protected static final BlockProperty lit = new BlockProperty("lit", new String[]{"false", "true"});

	public BlockRedstoneOre() {
		super("redstone_ore");
		setOldId(73);
		setOldName("redstone_ore");
		blockProperties.add(lit);
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		if (lit.getValue().equals("true")) {
			return new BlockLitRedstoneOre();
		} else {
			return this;
		}
	}
}