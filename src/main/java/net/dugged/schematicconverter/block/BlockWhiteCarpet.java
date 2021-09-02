package net.dugged.schematicconverter.block;

public class BlockWhiteCarpet extends Block {
	public BlockWhiteCarpet() {
		super("white_carpet");
		setOldId(171);
		setOldName("carpet");
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 1:
				return new BlockOrangeCarpet();
			case 2:
				return new BlockMagentaCarpet();
			case 3:
				return new BlockLightBlueCarpet();
			case 4:
				return new BlockYellowCarpet();
			case 5:
				return new BlockLimeCarpet();
			case 6:
				return new BlockPinkCarpet();
			case 7:
				return new BlockGrayCarpet();
			case 8:
				return new BlockLightGrayCarpet();
			case 9:
				return new BlockCyanCarpet();
			case 10:
				return new BlockPurpleCarpet();
			case 11:
				return new BlockBlueCarpet();
			case 12:
				return new BlockBrownCarpet();
			case 13:
				return new BlockGreenCarpet();
			case 14:
				return new BlockRedCarpet();
			case 15:
				return new BlockBlackCarpet();
			default:
				return new BlockWhiteCarpet();
		}
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}