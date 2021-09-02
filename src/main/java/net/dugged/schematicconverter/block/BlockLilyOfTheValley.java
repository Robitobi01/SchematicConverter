package net.dugged.schematicconverter.block;

public class BlockLilyOfTheValley extends Block {
	public BlockLilyOfTheValley() {
		super("lily_of_the_valley");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}