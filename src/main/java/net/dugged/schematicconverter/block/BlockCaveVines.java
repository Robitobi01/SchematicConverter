package net.dugged.schematicconverter.block;

public class BlockCaveVines extends Block {
	protected static final BlockProperty age = new BlockProperty("age", new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25"});
	protected static final BlockProperty berries = new BlockProperty("berries", new String[]{"false", "true"});

	public BlockCaveVines() {
		super("cave_vines");
		blockProperties.add(age);
		blockProperties.add(berries);
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