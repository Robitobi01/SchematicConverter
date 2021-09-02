package net.dugged.schematicconverter.block;

public class BlockDaylightDetectorInverted extends Block {

	public BlockDaylightDetectorInverted() {
		super("");
		setOldId(178);
		setOldName("daylight_detector_inverted");
		setAsLegacy();
	}

	@Override
	public Block getNewBlock() {
		return new BlockDaylightDetector().setProperty(BlockDaylightDetector.power.getName(), BlockDaylightDetector.power.getPropertyByIndex(getMetaBits(BlockDaylightDetector.power.getMetadataBitCount(), BlockDaylightDetector.power.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}