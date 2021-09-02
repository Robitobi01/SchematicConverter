package net.dugged.schematicconverter.block;

public class BlockWaterCauldron extends Block {
	protected static final BlockProperty level = new BlockProperty("level", new String[]{"1", "2", "3"});

	public BlockWaterCauldron() {
		super("water_cauldron");
		blockProperties.add(level);
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		switch (level.getValue()) {
			case "2":
				return new BlockCauldron().setMetadata(2);
			case "3":
				return new BlockCauldron().setMetadata(3);
			default:
				return new BlockCauldron().setMetadata(1);
		}
	}
}