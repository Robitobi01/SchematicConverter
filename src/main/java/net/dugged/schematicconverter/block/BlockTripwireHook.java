package net.dugged.schematicconverter.block;

public class BlockTripwireHook extends Block {
	protected static final BlockProperty attached = new BlockProperty("attached", new String[]{"false", "true"});
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "south", "west", "east"});
	protected static final BlockProperty powered = new BlockProperty("powered", new String[]{"false", "true"});

	public BlockTripwireHook() {
		super("tripwire_hook");
		setOldId(131);
		setOldName("tripwire_hook");
		attached.setMetadataIndexBit(2);
		attached.setMetadataBitCount(1);
		facing.setMetadataIndexBit(0);
		facing.setMetadataBitCount(2);
		powered.setMetadataIndexBit(3);
		powered.setMetadataBitCount(1);
		blockProperties.add(attached);
		blockProperties.add(facing);
		blockProperties.add(powered);
	}

	@Override
	public Block getNewBlock() {
		Block block = new BlockTripwireHook().setProperty(powered.getName(), powered.getPropertyByIndex(getMetaBits(powered.getMetadataBitCount(), powered.getMetadataIndexBit())));
		block = block.setProperty(attached.getName(), attached.getPropertyByIndex(getMetaBits(attached.getMetadataBitCount(), attached.getMetadataIndexBit())));
		return block.setProperty(facing.getName(), facing.getPropertyByIndex(getMetaBits(facing.getMetadataBitCount(), facing.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		Block block = new BlockTripwireHook().setMetadata(setMetaBits(powered.getCurrentIndex(), powered.getMetadataIndexBit()));
		block = block.setMetadata(block.setMetaBits(attached.getCurrentIndex(), attached.getMetadataIndexBit()));
		return block.setMetadata(block.setMetaBits(facing.getCurrentIndex(), facing.getMetadataIndexBit()));
	}
}