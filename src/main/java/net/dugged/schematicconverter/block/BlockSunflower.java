package net.dugged.schematicconverter.block;

public class BlockSunflower extends Block {
	protected static final BlockProperty half = new BlockProperty("half", new String[]{"upper", "lower"});

	public BlockSunflower() {
		super("sunflower");
		blockProperties.add(half);
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockTallGrass().setMetadata(setMetaBits(BlockTallGrass.half.getCurrentIndex(), BlockTallGrass.half.getMetadataIndexBit()));
	}
}