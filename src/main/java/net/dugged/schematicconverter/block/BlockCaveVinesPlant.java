package net.dugged.schematicconverter.block;

public class BlockCaveVinesPlant extends Block {
	protected static final BlockProperty berries = new BlockProperty("berries", new String[]{"false", "true"});

	public BlockCaveVinesPlant() {
		super("cave_vines_plant");
		blockProperties.add(berries);
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