package net.dugged.schematicconverter.block;

public class BlockRedstoneLamp extends Block {
	protected static final BlockProperty lit = new BlockProperty("lit", new String[]{"false", "true"});

	public BlockRedstoneLamp() {
		super("redstone_lamp");
		setOldId(123);
		setOldName("redstone_lamp");
		blockProperties.add(lit);
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		if (lit.getValue().equals("true")) {
			return new BlockLitRedstoneLamp();
		} else {
			return this;
		}
	}
}