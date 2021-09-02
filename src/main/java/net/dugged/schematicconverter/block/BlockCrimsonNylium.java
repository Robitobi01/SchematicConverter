package net.dugged.schematicconverter.block;

public class BlockCrimsonNylium extends Block {
	public BlockCrimsonNylium() {
		super("crimson_nylium");
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