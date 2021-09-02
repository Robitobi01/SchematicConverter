package net.dugged.schematicconverter.block;

public class BlockFern extends Block {
	public BlockFern() {
		super("fern");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockGrass().setMetadata(2);
	}
}