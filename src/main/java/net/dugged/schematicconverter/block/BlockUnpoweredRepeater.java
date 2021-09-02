package net.dugged.schematicconverter.block;

public class BlockUnpoweredRepeater extends Block {

	public BlockUnpoweredRepeater() {
		super("");
		setOldId(93);
		setOldName("unpowered_repeater");
		setAsLegacy();
	}

	@Override
	public Block getNewBlock() {
		Block block = new BlockRepeater().setProperty(BlockRepeater.facing.getName(), BlockRepeater.facing.getPropertyByIndex(getMetaBits(BlockRepeater.facing.getMetadataBitCount(), BlockRepeater.facing.getMetadataIndexBit())));
		return block.setProperty(BlockRepeater.delay.getName(), BlockRepeater.delay.getPropertyByIndex(getMetaBits(BlockRepeater.delay.getMetadataBitCount(), BlockRepeater.delay.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}