package net.dugged.schematicconverter.block;

public class BlockGlowstone extends Block {
	public BlockGlowstone() {
		super("glowstone");
		setOldId(89);
		setOldName("glowstone");
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