package net.dugged.schematicconverter.block;

public class BlockPurpleBanner extends Block {
	protected static final BlockProperty rotation = new BlockProperty("rotation", new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"});

	public BlockPurpleBanner() {
		super("purple_banner");
		blockProperties.add(rotation);
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