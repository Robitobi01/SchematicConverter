package net.dugged.schematicconverter.block;

public class BlockSoulFire extends Block {
	public BlockSoulFire() {
		super("soul_fire");
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