package net.dugged.schematicconverter.block;

public class BlockWhiteWool extends Block {
	public BlockWhiteWool() {
		super("white_wool");
		setOldId(35);
		setOldName("wool");
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 1:
				return new BlockOrangeWool();
			case 2:
				return new BlockMagentaWool();
			case 3:
				return new BlockLightBlueWool();
			case 4:
				return new BlockYellowWool();
			case 5:
				return new BlockLimeWool();
			case 6:
				return new BlockPinkWool();
			case 7:
				return new BlockGrayWool();
			case 8:
				return new BlockLightGrayWool();
			case 9:
				return new BlockCyanWool();
			case 10:
				return new BlockPurpleWool();
			case 11:
				return new BlockBlueWool();
			case 12:
				return new BlockBrownWool();
			case 13:
				return new BlockGreenWool();
			case 14:
				return new BlockRedWool();
			case 15:
				return new BlockBlackWool();
			default:
				return new BlockWhiteWool();
		}
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}