package net.dugged.schematicconverter.block;

public class BlockFletchingTable extends Block {
	public BlockFletchingTable() {
		super("fletching_table");
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