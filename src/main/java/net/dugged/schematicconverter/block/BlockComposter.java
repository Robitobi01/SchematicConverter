package net.dugged.schematicconverter.block;

public class BlockComposter extends Block {
	protected static final BlockProperty level = new BlockProperty("level", new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8"});

	public BlockComposter() {
		super("composter");
		blockProperties.add(level);
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