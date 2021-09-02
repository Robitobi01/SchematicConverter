package net.dugged.schematicconverter.block;

public class BlockNetherQuartzOre extends Block {
	public BlockNetherQuartzOre() {
		super("nether_quartz_ore");
		setOldId(153);
		setOldName("quartz_ore");
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