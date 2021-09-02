package net.dugged.schematicconverter.block;

public class BlockPottedLilyOfTheValley extends Block {
	public BlockPottedLilyOfTheValley() {
		super("potted_lily_of_the_valley");
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