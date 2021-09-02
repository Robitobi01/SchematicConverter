package net.dugged.schematicconverter.block;

public class BlockMossyCobblestone extends Block {
	public BlockMossyCobblestone() {
		super("mossy_cobblestone");
		setOldId(48);
		setOldName("mossy_cobblestone");
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