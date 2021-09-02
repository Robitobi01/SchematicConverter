package net.dugged.schematicconverter.block;

public class BlockPowderSnowCauldron extends Block {
	protected static final BlockProperty level = new BlockProperty("level", new String[]{"1", "2", "3"});

	public BlockPowderSnowCauldron() {
		super("powder_snow_cauldron");
		blockProperties.add(level);
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