package net.dugged.schematicconverter.block;

public class BlockCartographyTable extends Block {
	public BlockCartographyTable() {
		super("cartography_table");
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