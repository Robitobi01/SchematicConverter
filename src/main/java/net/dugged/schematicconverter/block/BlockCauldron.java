package net.dugged.schematicconverter.block;

public class BlockCauldron extends Block {
	public BlockCauldron() {
		super("cauldron");
		setOldId(118);
		setOldName("cauldron");
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 1:
				return new BlockWaterCauldron().setProperty(BlockWaterCauldron.level.getName(), "1");
			case 2:
				return new BlockWaterCauldron().setProperty(BlockWaterCauldron.level.getName(), "2");
			case 3:
				return new BlockWaterCauldron().setProperty(BlockWaterCauldron.level.getName(), "3");
			default:
				return new BlockCauldron();
		}
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}