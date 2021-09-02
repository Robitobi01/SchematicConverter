package net.dugged.schematicconverter.block;

public class BlockSeaLantern extends Block {
	public BlockSeaLantern() {
		super("sea_lantern");
		setOldId(169);
		setOldName("sea_lantern");
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