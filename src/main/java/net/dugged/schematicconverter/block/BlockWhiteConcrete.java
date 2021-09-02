package net.dugged.schematicconverter.block;

public class BlockWhiteConcrete extends Block {
	public BlockWhiteConcrete() {
		super("white_concrete");
		setOldId(251);
		setOldName("concrete");
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 1:
				return new BlockOrangeConcrete();
			case 2:
				return new BlockMagentaConcrete();
			case 3:
				return new BlockLightBlueConcrete();
			case 4:
				return new BlockYellowConcrete();
			case 5:
				return new BlockLimeConcrete();
			case 6:
				return new BlockPinkConcrete();
			case 7:
				return new BlockGrayConcrete();
			case 8:
				return new BlockLightGrayConcrete();
			case 9:
				return new BlockCyanConcrete();
			case 10:
				return new BlockPurpleConcrete();
			case 11:
				return new BlockBlueConcrete();
			case 12:
				return new BlockBrownConcrete();
			case 13:
				return new BlockGreenConcrete();
			case 14:
				return new BlockRedConcrete();
			case 15:
				return new BlockBlackConcrete();
			default:
				return new BlockWhiteConcrete();
		}
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}