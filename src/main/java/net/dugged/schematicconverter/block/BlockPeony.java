package net.dugged.schematicconverter.block;

public class BlockPeony extends Block {
	protected static final BlockProperty half = new BlockProperty("half", new String[]{"upper", "lower"});

	public BlockPeony() {
		super("peony");
		blockProperties.add(half);
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockTallGrass().setMetadata(setMetaBits(5, BlockTallGrass.half.getCurrentIndex(), BlockTallGrass.half.getMetadataIndexBit()));
	}
}