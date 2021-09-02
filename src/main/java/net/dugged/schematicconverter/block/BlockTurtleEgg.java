package net.dugged.schematicconverter.block;

public class BlockTurtleEgg extends Block {
	protected static final BlockProperty eggs = new BlockProperty("eggs", new String[]{"1", "2", "3", "4"});
	protected static final BlockProperty hatch = new BlockProperty("hatch", new String[]{"0", "1", "2"});

	public BlockTurtleEgg() {
		super("turtle_egg");
		blockProperties.add(eggs);
		blockProperties.add(hatch);
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