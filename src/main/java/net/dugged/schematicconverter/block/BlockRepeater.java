package net.dugged.schematicconverter.block;

public class BlockRepeater extends Block {
	protected static final BlockProperty delay = new BlockProperty("delay", new String[]{"1", "2", "3", "4"});
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "east", "south", "west"});
	protected static final BlockProperty locked = new BlockProperty("locked", new String[]{"false", "true"});
	protected static final BlockProperty powered = new BlockProperty("powered", new String[]{"false", "true"});

	public BlockRepeater() {
		super("repeater");
		setOldId(94);
		setOldName("powered_repeater");
		delay.setMetadataIndexBit(2);
		delay.setMetadataBitCount(2);
		facing.setMetadataIndexBit(0);
		facing.setMetadataBitCount(2);
		blockProperties.add(delay);
		blockProperties.add(facing);
		blockProperties.add(locked);
		blockProperties.add(powered);
	}

	@Override
	public Block getNewBlock() {
		Block block = new BlockRepeater().setProperty(facing.getName(), facing.getPropertyByIndex(getMetaBits(facing.getMetadataBitCount(), facing.getMetadataIndexBit())));
		block = block.setProperty(powered.getName(), "true");
		return block.setProperty(delay.getName(), delay.getPropertyByIndex(getMetaBits(delay.getMetadataBitCount(), delay.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		if (powered.getValue().equals("true")) {
			Block block = new BlockRepeater().setMetadata(setMetaBits(facing.getCurrentIndex(), facing.getMetadataIndexBit()));
			return block.setMetadata(block.setMetaBits(delay.getCurrentIndex(), delay.getMetadataIndexBit()));
		} else {
			Block block = new BlockUnpoweredRepeater().setMetadata(setMetaBits(facing.getCurrentIndex(), facing.getMetadataIndexBit()));
			return block.setMetadata(block.setMetaBits(delay.getCurrentIndex(), delay.getMetadataIndexBit()));
		}
	}
}