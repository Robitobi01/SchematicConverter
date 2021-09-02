package net.dugged.schematicconverter.block;

public class BlockVine extends Block {
	protected static final BlockProperty east = new BlockProperty("east", new String[]{"false", "true"});
	protected static final BlockProperty north = new BlockProperty("north", new String[]{"false", "true"});
	protected static final BlockProperty south = new BlockProperty("south", new String[]{"false", "true"});
	protected static final BlockProperty up = new BlockProperty("up", new String[]{"false", "true"});
	protected static final BlockProperty west = new BlockProperty("west", new String[]{"false", "true"});

	public BlockVine() {
		super("vine");
		setOldId(106);
		setOldName("vine");
		blockProperties.add(east);
		blockProperties.add(north);
		blockProperties.add(south);
		blockProperties.add(up);
		blockProperties.add(west);
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 1:
				return new BlockVine().setProperty(north.getName(), "true");
			case 2:
				return new BlockVine().setProperty(east.getName(), "true");
			case 4:
				return new BlockVine().setProperty(south.getName(), "true");
			case 8:
				return new BlockVine().setProperty(west.getName(), "true");
			default:
				return new BlockVine().setProperty(up.getName(), "true");
		}
	}

	@Override
	public Block getOldBlock() {
		if (north.getValue().equals("true")) {
			return new BlockVine().setMetadata(1);
		} else if (east.getValue().equals("true")) {
			return new BlockVine().setMetadata(2);
		} else if (south.getValue().equals("true")) {
			return new BlockVine().setMetadata(4);
		} else if (west.getValue().equals("true")) {
			return new BlockVine().setMetadata(8);
		} else {
			return new BlockVine();
		}
	}
}