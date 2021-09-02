package net.dugged.schematicconverter.block;

public class BlockLilac extends Block {
	protected static final BlockProperty half = new BlockProperty("half", new String[]{"upper", "lower"});

	public BlockLilac() {
		super("lilac");
		blockProperties.add(half);
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockTallGrass().setMetadata(setMetaBits(1, BlockTallGrass.half.getCurrentIndex(), BlockTallGrass.half.getMetadataIndexBit()));
	}
}