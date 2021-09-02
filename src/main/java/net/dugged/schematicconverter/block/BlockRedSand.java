package net.dugged.schematicconverter.block;

public class BlockRedSand extends Block {
	public BlockRedSand() {
		super("red_sand");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockSand().setMetadata(1);
	}
}