package net.dugged.schematicconverter.block;

public class BlockSoulSand extends Block {
	public BlockSoulSand() {
		super("soul_sand");
		setOldId(88);
		setOldName("soul_sand");
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