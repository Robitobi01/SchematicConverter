package net.dugged.schematicconverter.block;

public class BlockNetherBricks extends Block {
	public BlockNetherBricks() {
		super("nether_bricks");
		setOldId(112);
		setOldName("nether_brick");
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