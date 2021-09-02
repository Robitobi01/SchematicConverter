package net.dugged.schematicconverter.block;

public class BlockBubbleColumn extends Block {
	protected static final BlockProperty drag = new BlockProperty("drag", new String[]{"false", "true"});

	public BlockBubbleColumn() {
		super("bubble_column");
		blockProperties.add(drag);
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