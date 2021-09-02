package net.dugged.schematicconverter.block;

public class BlockUnpoweredComparator extends Block {

	public BlockUnpoweredComparator() {
		super("");
		setOldId(149);
		setOldName("unpowered_comparator");
		setAsLegacy();
	}

	@Override
	public Block getNewBlock() {
		Block block = new BlockComparator().setProperty(BlockComparator.facing.getName(), BlockComparator.facing.getPropertyByIndex(getMetaBits(BlockComparator.facing.getMetadataBitCount(), BlockComparator.facing.getMetadataIndexBit())));
		return block.setProperty(BlockComparator.mode.getName(), BlockComparator.mode.getPropertyByIndex(getMetaBits(BlockComparator.mode.getMetadataBitCount(), BlockComparator.mode.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}