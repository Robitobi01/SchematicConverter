package net.dugged.schematicconverter.block;

public class BlockBeacon extends Block {
	public BlockBeacon() {
		super("beacon");
		setOldId(138);
		setOldName("beacon");
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