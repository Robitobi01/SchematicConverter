package net.dugged.schematicconverter.block;

public class BlockTripwire extends Block {
	protected static final BlockProperty attached = new BlockProperty("attached", new String[]{"false", "true"});
	protected static final BlockProperty disarmed = new BlockProperty("disarmed", new String[]{"false", "true"});
	protected static final BlockProperty east = new BlockProperty("east", new String[]{"false", "true"});
	protected static final BlockProperty north = new BlockProperty("north", new String[]{"false", "true"});
	protected static final BlockProperty powered = new BlockProperty("powered", new String[]{"false", "true"});
	protected static final BlockProperty south = new BlockProperty("south", new String[]{"false", "true"});
	protected static final BlockProperty west = new BlockProperty("west", new String[]{"false", "true"});

	public BlockTripwire() {
		super("tripwire");
		setOldId(132);
		setOldName("tripwire");
		attached.setMetadataIndexBit(2);
		attached.setMetadataBitCount(1);
		disarmed.setMetadataIndexBit(3);
		disarmed.setMetadataBitCount(1);
		powered.setMetadataIndexBit(0);
		powered.setMetadataBitCount(1);
		blockProperties.add(attached);
		blockProperties.add(disarmed);
		blockProperties.add(east);
		blockProperties.add(north);
		blockProperties.add(powered);
		blockProperties.add(south);
		blockProperties.add(west);
	}

	@Override
	public Block getNewBlock() {
		Block block = new BlockTripwire().setProperty(powered.getName(), powered.getPropertyByIndex(getMetaBits(powered.getMetadataBitCount(), powered.getMetadataIndexBit())));
		block = block.setProperty(attached.getName(), attached.getPropertyByIndex(getMetaBits(attached.getMetadataBitCount(), attached.getMetadataIndexBit())));
		return block.setProperty(disarmed.getName(), disarmed.getPropertyByIndex(getMetaBits(disarmed.getMetadataBitCount(), disarmed.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		Block block = new BlockTripwire().setMetadata(setMetaBits(powered.getCurrentIndex(), powered.getMetadataIndexBit()));
		block = block.setMetadata(block.setMetaBits(attached.getCurrentIndex(), attached.getMetadataIndexBit()));
		return block.setMetadata(block.setMetaBits(disarmed.getCurrentIndex(), disarmed.getMetadataIndexBit()));
	}
}