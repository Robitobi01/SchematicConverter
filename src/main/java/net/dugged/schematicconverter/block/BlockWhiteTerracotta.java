package net.dugged.schematicconverter.block;

public class BlockWhiteTerracotta extends Block {
	public BlockWhiteTerracotta() {
		super("white_terracotta");
		setOldId(159);
		setOldName("stained_hardened_clay");
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 1:
				return new BlockOrangeTerracotta();
			case 2:
				return new BlockMagentaTerracotta();
			case 3:
				return new BlockLightBlueTerracotta();
			case 4:
				return new BlockYellowTerracotta();
			case 5:
				return new BlockLimeTerracotta();
			case 6:
				return new BlockPinkTerracotta();
			case 7:
				return new BlockGrayTerracotta();
			case 8:
				return new BlockLightGrayTerracotta();
			case 9:
				return new BlockCyanTerracotta();
			case 10:
				return new BlockPurpleTerracotta();
			case 11:
				return new BlockBlueTerracotta();
			case 12:
				return new BlockBrownTerracotta();
			case 13:
				return new BlockGreenTerracotta();
			case 14:
				return new BlockRedTerracotta();
			case 15:
				return new BlockBlackTerracotta();
			default:
				return new BlockWhiteTerracotta();
		}
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}