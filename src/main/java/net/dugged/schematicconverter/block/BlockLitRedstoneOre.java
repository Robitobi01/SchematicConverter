package net.dugged.schematicconverter.block;

public class BlockLitRedstoneOre extends Block {

	public BlockLitRedstoneOre() {
		super("");
		setOldId(74);
		setOldName("lit_redstone_ore");
		setAsLegacy();
	}

	@Override
	public Block getNewBlock() {
		return new BlockRedstoneOre().setProperty(BlockRedstoneOre.lit.getName(), "true");
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}