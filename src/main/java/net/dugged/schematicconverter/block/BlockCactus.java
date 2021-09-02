package net.dugged.schematicconverter.block;

public class BlockCactus extends Block {
	protected static final BlockProperty age = new BlockProperty("age", new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"});

	public BlockCactus() {
		super("cactus");
		setOldId(81);
		setOldName("cactus");
		blockProperties.add(age);
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