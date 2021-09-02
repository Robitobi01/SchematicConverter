package net.dugged.schematicconverter.block;

public class BlockRedNetherBricks extends Block {
	public BlockRedNetherBricks() {
		super("red_nether_bricks");
		setOldId(215);
		setOldName("red_nether_brick");
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