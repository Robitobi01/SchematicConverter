package net.dugged.schematicconverter.block;

public class BlockWhiteStainedGlassPane extends Block {
	private static final BlockProperty east = new BlockProperty("east", new String[]{"false", "true"});
	private static final BlockProperty north = new BlockProperty("north", new String[]{"false", "true"});
	private static final BlockProperty south = new BlockProperty("south", new String[]{"false", "true"});
	private static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});
	private static final BlockProperty west = new BlockProperty("west", new String[]{"false", "true"});

	public BlockWhiteStainedGlassPane() {
		super("white_stained_glass_pane");
		setOldId(160);
		setOldName("stained_glass_pane");
		blockProperties.add(east);
		blockProperties.add(north);
		blockProperties.add(south);
		blockProperties.add(waterlogged);
		blockProperties.add(west);
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 1:
				return new BlockOrangeStainedGlassPane();
			case 2:
				return new BlockMagentaStainedGlassPane();
			case 3:
				return new BlockLightBlueStainedGlassPane();
			case 4:
				return new BlockYellowStainedGlassPane();
			case 5:
				return new BlockLimeStainedGlassPane();
			case 6:
				return new BlockPinkStainedGlassPane();
			case 7:
				return new BlockGrayStainedGlassPane();
			case 8:
				return new BlockLightGrayStainedGlassPane();
			case 9:
				return new BlockCyanStainedGlassPane();
			case 10:
				return new BlockPurpleStainedGlassPane();
			case 11:
				return new BlockBlueStainedGlassPane();
			case 12:
				return new BlockBrownStainedGlassPane();
			case 13:
				return new BlockGreenStainedGlassPane();
			case 14:
				return new BlockRedStainedGlassPane();
			case 15:
				return new BlockBlackStainedGlassPane();
			default:
				return new BlockWhiteStainedGlassPane();
		}
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}