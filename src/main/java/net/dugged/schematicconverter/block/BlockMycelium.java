package net.dugged.schematicconverter.block;

public class BlockMycelium extends Block {
	protected static final BlockProperty snowy = new BlockProperty("snowy", new String[]{"false", "true"});

	public BlockMycelium() {
		super("mycelium");
		setOldId(110);
		setOldName("mycelium");
		blockProperties.add(snowy);
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