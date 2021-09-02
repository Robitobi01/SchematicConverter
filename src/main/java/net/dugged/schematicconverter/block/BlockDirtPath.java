package net.dugged.schematicconverter.block;

public class BlockDirtPath extends Block {
	public BlockDirtPath() {
		super("dirt_path");
		setOldId(208);
		setOldName("grass_path");
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