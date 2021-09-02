package net.dugged.schematicconverter.block;

public class BlockSweetBerryBush extends Block {
	protected static final BlockProperty age = new BlockProperty("age", new String[]{"0", "1", "2", "3"});

	public BlockSweetBerryBush() {
		super("sweet_berry_bush");
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