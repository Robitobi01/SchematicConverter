package net.dugged.schematicconverter.block;

public class BlockCobblestone extends Block {
	public BlockCobblestone() {
		super("cobblestone");
		setOldId(4);
		setOldName("cobblestone");
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