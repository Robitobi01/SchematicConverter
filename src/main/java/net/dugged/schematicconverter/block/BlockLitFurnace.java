package net.dugged.schematicconverter.block;

public class BlockLitFurnace extends Block {

	public BlockLitFurnace() {
		super("furnace");
		setOldId(62);
		setOldName("lit_furnace");
		setAsLegacy();
	}

	@Override
	public Block getNewBlock() {
		Block block = new BlockFurnace().setProperty(BlockFurnace.lit.getName(), "true");
		switch (metadata) {
			case 3:
				return block.setProperty(BlockFurnace.facing.getName(), "south");
			case 4:
				return block.setProperty(BlockFurnace.facing.getName(), "west");
			case 5:
				return block.setProperty(BlockFurnace.facing.getName(), "east");
			default:
				return block.setProperty(BlockFurnace.facing.getName(), "north");
		}
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}