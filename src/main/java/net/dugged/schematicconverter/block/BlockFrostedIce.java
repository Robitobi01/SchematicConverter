package net.dugged.schematicconverter.block;

public class BlockFrostedIce extends Block {
	protected static final BlockProperty age = new BlockProperty("age", new String[]{"0", "1", "2", "3"});

	public BlockFrostedIce() {
		super("frosted_ice");
		setOldId(212);
		setOldName("frosted_ice");
		age.setMetadataIndexBit(0);
		age.setMetadataBitCount(2);
		blockProperties.add(age);
	}

	@Override
	public Block getNewBlock() {
		return new BlockFrostedIce().setProperty(age.getName(), age.getPropertyByIndex(getMetaBits(age.getMetadataBitCount(), age.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		return new BlockFrostedIce().setMetadata(setMetaBits(age.getCurrentIndex(), age.getMetadataIndexBit()));
	}
}