package net.dugged.schematicconverter.block;

public class BlockLargeFern extends Block {
	protected static final BlockProperty half = new BlockProperty("half", new String[]{"upper", "lower"});

	public BlockLargeFern() {
		super("large_fern");
		blockProperties.add(half);
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockTallGrass().setMetadata(setMetaBits(3, BlockTallGrass.half.getCurrentIndex(), BlockTallGrass.half.getMetadataIndexBit()));
	}
}