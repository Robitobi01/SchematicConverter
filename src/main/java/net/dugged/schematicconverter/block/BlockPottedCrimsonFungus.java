package net.dugged.schematicconverter.block;

public class BlockPottedCrimsonFungus extends Block {
	public BlockPottedCrimsonFungus() {
		super("potted_crimson_fungus");
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