package net.dugged.schematicconverter.block;

public class BlockTnt extends Block {
	protected static final BlockProperty unstable = new BlockProperty("unstable", new String[]{"false", "true"});

	public BlockTnt() {
		super("tnt");
		setOldId(46);
		setOldName("tnt");
		blockProperties.add(unstable);
	}

	@Override
	public Block getNewBlock() {
		if (metadata == 1) {
			return new BlockTnt().setProperty(unstable.getName(), "true");
		} else {
			return new BlockTnt();
		}
	}

	@Override
	public Block getOldBlock() {
		if (unstable.getValue().equals("true")) {
			return new BlockTnt().setMetadata(1);
		} else {
			return new BlockTnt();
		}
	}
}