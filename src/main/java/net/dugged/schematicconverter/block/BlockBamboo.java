package net.dugged.schematicconverter.block;

public class BlockBamboo extends Block {
	protected static final BlockProperty age = new BlockProperty("age", new String[]{"0", "1"});
	protected static final BlockProperty leaves = new BlockProperty("leaves", new String[]{"none", "small", "large"});
	protected static final BlockProperty stage = new BlockProperty("stage", new String[]{"0", "1"});

	public BlockBamboo() {
		super("bamboo");
		blockProperties.add(age);
		blockProperties.add(leaves);
		blockProperties.add(stage);
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