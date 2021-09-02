package net.dugged.schematicconverter.block;

public class BlockCraftingTable extends Block {
	public BlockCraftingTable() {
		super("crafting_table");
		setOldId(58);
		setOldName("crafting_table");
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