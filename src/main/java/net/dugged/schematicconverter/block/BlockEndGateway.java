package net.dugged.schematicconverter.block;

public class BlockEndGateway extends Block {
	public BlockEndGateway() {
		super("end_gateway");
		setOldId(209);
		setOldName("end_gateway");
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