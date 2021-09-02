package net.dugged.schematicconverter.block;

public class BlockPackedIce extends Block {
	public BlockPackedIce() {
		super("packed_ice");
		setOldId(174);
		setOldName("packed_ice");
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