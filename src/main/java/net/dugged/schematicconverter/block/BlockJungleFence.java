package net.dugged.schematicconverter.block;

public class BlockJungleFence extends Block {
	protected static final BlockProperty east = new BlockProperty("east", new String[]{"false", "true"});
	protected static final BlockProperty north = new BlockProperty("north", new String[]{"false", "true"});
	protected static final BlockProperty south = new BlockProperty("south", new String[]{"false", "true"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});
	protected static final BlockProperty west = new BlockProperty("west", new String[]{"false", "true"});

	public BlockJungleFence() {
		super("jungle_fence");
		setOldId(190);
		setOldName("jungle_fence");
		blockProperties.add(east);
		blockProperties.add(north);
		blockProperties.add(south);
		blockProperties.add(waterlogged);
		blockProperties.add(west);
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