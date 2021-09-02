package net.dugged.schematicconverter.block;

public class BlockSmithingTable extends Block {
	public BlockSmithingTable() {
		super("smithing_table");
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