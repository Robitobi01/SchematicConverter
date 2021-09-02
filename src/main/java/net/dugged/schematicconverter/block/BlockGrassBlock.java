package net.dugged.schematicconverter.block;

public class BlockGrassBlock extends Block {
	protected static final BlockProperty snowy = new BlockProperty("snowy", new String[]{"false", "true"});

	public BlockGrassBlock() {
		super("grass_block");
		setOldId(2);
		setOldName("grass");
		blockProperties.add(snowy);
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