package net.dugged.schematicconverter.block;

public class BlockQuartzPillar extends Block {
	protected static final BlockProperty axis = new BlockProperty("axis", new String[]{"y", "x", "z"});

	public BlockQuartzPillar() {
		super("quartz_pillar");
		blockProperties.add(axis);
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		switch (axis.getValue()) {
			case "x":
				return new BlockQuartzBlock().setMetadata(3);
			case "z":
				return new BlockQuartzBlock().setMetadata(4);
			default:
				return new BlockQuartzBlock().setMetadata(2);
		}
	}
}