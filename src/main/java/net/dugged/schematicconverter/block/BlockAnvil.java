package net.dugged.schematicconverter.block;

public class BlockAnvil extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "east", "south", "west"});

	public BlockAnvil() {
		super("anvil");
		setOldId(145);
		setOldName("anvil");
		facing.setMetadataIndexBit(0);
		facing.setMetadataBitCount(2);
		blockProperties.add(facing);
	}

	@Override
	public Block getNewBlock() {
		if (getMetaBits(1, 2) == 1) {
			return new BlockChippedAnvil().setProperty(facing.getName(), facing.getPropertyByIndex(getMetaBits(facing.getMetadataBitCount(), facing.getMetadataIndexBit())));
		} else if (getMetaBits(1, 3) == 1) {
			return new BlockDamagedAnvil().setProperty(facing.getName(), facing.getPropertyByIndex(getMetaBits(facing.getMetadataBitCount(), facing.getMetadataIndexBit())));
		} else {
			return new BlockAnvil().setProperty(facing.getName(), facing.getPropertyByIndex(getMetaBits(facing.getMetadataBitCount(), facing.getMetadataIndexBit())));
		}
	}

	@Override
	public Block getOldBlock() {
		return new BlockAnvil().setMetadata(setMetaBits(facing.getCurrentIndex(), facing.getMetadataIndexBit()));
	}
}