package net.dugged.schematicconverter.block;

public class BlockWhiteStainedGlass extends Block {
	public BlockWhiteStainedGlass() {
		super("white_stained_glass");
		setOldId(95);
		setOldName("stained_glass");
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 1:
				return new BlockOrangeStainedGlass();
			case 2:
				return new BlockMagentaStainedGlass();
			case 3:
				return new BlockLightBlueStainedGlass();
			case 4:
				return new BlockYellowStainedGlass();
			case 5:
				return new BlockLimeStainedGlass();
			case 6:
				return new BlockPinkStainedGlass();
			case 7:
				return new BlockGrayStainedGlass();
			case 8:
				return new BlockLightGrayStainedGlass();
			case 9:
				return new BlockCyanStainedGlass();
			case 10:
				return new BlockPurpleStainedGlass();
			case 11:
				return new BlockBlueStainedGlass();
			case 12:
				return new BlockBrownStainedGlass();
			case 13:
				return new BlockGreenStainedGlass();
			case 14:
				return new BlockRedStainedGlass();
			case 15:
				return new BlockBlackStainedGlass();
			default:
				return new BlockWhiteStainedGlass();
		}
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}