package net.dugged.schematicconverter.block;

public class BlockBrownMushroomBlock extends Block {
	protected static final BlockProperty down = new BlockProperty("down", new String[]{"false", "true"});
	protected static final BlockProperty east = new BlockProperty("east", new String[]{"false", "true"});
	protected static final BlockProperty north = new BlockProperty("north", new String[]{"false", "true"});
	protected static final BlockProperty south = new BlockProperty("south", new String[]{"false", "true"});
	protected static final BlockProperty up = new BlockProperty("up", new String[]{"false", "true"});
	protected static final BlockProperty west = new BlockProperty("west", new String[]{"false", "true"});

	public BlockBrownMushroomBlock() {
		super("brown_mushroom_block");
		setOldId(99);
		setOldName("brown_mushroom_block");
		blockProperties.add(down);
		blockProperties.add(east);
		blockProperties.add(north);
		blockProperties.add(south);
		blockProperties.add(up);
		blockProperties.add(west);
	}

	@Override
	public Block getNewBlock() {
		Block block = new BlockBrownMushroomBlock().setProperty(down.getName(), "true");
		block = block.setProperty(east.getName(), "true").setProperty(north.getName(), "true");
		block = block.setProperty(south.getName(), "true").setProperty(up.getName(), "true");
		return block.setProperty(west.getName(), "true");
	}

	@Override
	public Block getOldBlock() {
		return new BlockBrownMushroomBlock().setMetadata(14);
	}
}