package net.dugged.schematicconverter.block;

public class BlockCrimsonFungus extends Block {
	public BlockCrimsonFungus() {
		super("crimson_fungus");
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