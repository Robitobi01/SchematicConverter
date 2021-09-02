package net.dugged.schematicconverter.block;

public class BlockEnchantingTable extends Block {
	public BlockEnchantingTable() {
		super("enchanting_table");
		setOldId(116);
		setOldName("enchanting_table");
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