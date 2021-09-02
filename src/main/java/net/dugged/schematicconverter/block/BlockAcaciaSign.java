package net.dugged.schematicconverter.block;

public class BlockAcaciaSign extends Block {
	protected static final BlockProperty rotation = new BlockProperty("rotation", new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockAcaciaSign() {
		super("acacia_sign");
		blockProperties.add(rotation);
		blockProperties.add(waterlogged);
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