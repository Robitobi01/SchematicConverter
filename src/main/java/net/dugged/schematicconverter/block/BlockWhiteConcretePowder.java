package net.dugged.schematicconverter.block;

public class BlockWhiteConcretePowder extends Block {
	public BlockWhiteConcretePowder() {
		super("white_concrete_powder");
		setOldId(252);
		setOldName("concrete_powder");
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 1:
				return new BlockOrangeConcretePowder();
			case 2:
				return new BlockMagentaConcretePowder();
			case 3:
				return new BlockLightBlueConcretePowder();
			case 4:
				return new BlockYellowConcretePowder();
			case 5:
				return new BlockLimeConcretePowder();
			case 6:
				return new BlockPinkConcretePowder();
			case 7:
				return new BlockGrayConcretePowder();
			case 8:
				return new BlockLightGrayConcretePowder();
			case 9:
				return new BlockCyanConcretePowder();
			case 10:
				return new BlockPurpleConcretePowder();
			case 11:
				return new BlockBlueConcretePowder();
			case 12:
				return new BlockBrownConcretePowder();
			case 13:
				return new BlockGreenConcretePowder();
			case 14:
				return new BlockRedConcretePowder();
			case 15:
				return new BlockBlackConcretePowder();
			default:
				return new BlockWhiteConcretePowder();
		}
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}