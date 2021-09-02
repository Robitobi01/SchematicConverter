package net.dugged.schematicconverter.block;

public class BlockDaylightDetector extends Block {
	protected static final BlockProperty inverted = new BlockProperty("inverted", new String[]{"false", "true"});
	protected static final BlockProperty power = new BlockProperty("power", new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"});

	public BlockDaylightDetector() {
		super("daylight_detector");
		setOldId(151);
		setOldName("daylight_detector");
		power.setMetadataIndexBit(0);
		power.setMetadataBitCount(4);
		blockProperties.add(inverted);
		blockProperties.add(power);
	}

	@Override
	public Block getNewBlock() {
		Block block = new BlockDaylightDetector().setProperty(inverted.getName(), "true");
		return block.setProperty(power.getName(), power.getPropertyByIndex(getMetaBits(power.getMetadataBitCount(), power.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		if (inverted.getValue().equals("true")) {
			return new BlockDaylightDetectorInverted().setMetadata(setMetaBits(power.getCurrentIndex(), power.getMetadataIndexBit()));
		} else {
			return new BlockDaylightDetector().setMetadata(setMetaBits(power.getCurrentIndex(), power.getMetadataIndexBit()));
		}
	}
}