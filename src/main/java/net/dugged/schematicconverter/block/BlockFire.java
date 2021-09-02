package net.dugged.schematicconverter.block;

public class BlockFire extends Block {
	protected static final BlockProperty age = new BlockProperty("age", new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"});
	protected static final BlockProperty east = new BlockProperty("east", new String[]{"false", "true"});
	protected static final BlockProperty north = new BlockProperty("north", new String[]{"false", "true"});
	protected static final BlockProperty south = new BlockProperty("south", new String[]{"false", "true"});
	protected static final BlockProperty up = new BlockProperty("up", new String[]{"false", "true"});
	protected static final BlockProperty west = new BlockProperty("west", new String[]{"false", "true"});

	public BlockFire() {
		super("fire");
		setOldId(51);
		setOldName("fire");
		blockProperties.add(age);
		blockProperties.add(east);
		blockProperties.add(north);
		blockProperties.add(south);
		blockProperties.add(up);
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