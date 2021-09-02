package net.dugged.schematicconverter.block;

public class BlockRedstoneWire extends Block {
	protected static final BlockProperty east = new BlockProperty("east", new String[]{"up", "side", "none"});
	protected static final BlockProperty north = new BlockProperty("north", new String[]{"up", "side", "none"});
	protected static final BlockProperty power = new BlockProperty("power", new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"});
	protected static final BlockProperty south = new BlockProperty("south", new String[]{"up", "side", "none"});
	protected static final BlockProperty west = new BlockProperty("west", new String[]{"up", "side", "none"});

	public BlockRedstoneWire() {
		super("redstone_wire");
		setOldId(55);
		setOldName("redstone_wire");
		power.setMetadataIndexBit(0);
		power.setMetadataBitCount(4);
		blockProperties.add(east);
		blockProperties.add(north);
		blockProperties.add(power);
		blockProperties.add(south);
		blockProperties.add(west);
	}

	@Override
	public Block getNewBlock() {
		return new BlockRedstoneWire().setProperty(power.getName(), power.getPropertyByIndex(getMetaBits(power.getMetadataIndexBit(), power.getMetadataBitCount())));
	}

	@Override
	public Block getOldBlock() {
		return new BlockRedstoneWire().setMetadata(setMetaBits(power.getCurrentIndex(), power.getMetadataIndexBit()));
	}
}