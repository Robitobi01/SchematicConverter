package net.dugged.schematicconverter.block;

public class BlockEndPortal extends Block {
	public BlockEndPortal() {
		super("end_portal");
		setOldId(119);
		setOldName("end_portal");
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