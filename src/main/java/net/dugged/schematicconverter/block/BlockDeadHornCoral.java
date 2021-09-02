package net.dugged.schematicconverter.block;

public class BlockDeadHornCoral extends Block {
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockDeadHornCoral() {
		super("dead_horn_coral");
		blockProperties.add(waterlogged);
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