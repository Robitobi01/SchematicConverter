package net.dugged.schematicconverter.block;

public class BlockSeagrass extends Block {
	public BlockSeagrass() {
		super("seagrass");
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