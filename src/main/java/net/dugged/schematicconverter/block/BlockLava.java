package net.dugged.schematicconverter.block;

public class BlockLava extends Block {
	protected static final BlockProperty level = new BlockProperty("level", new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"});

	public BlockLava() {
		super("lava");
		setOldId(11);
		setOldName("lava");
		level.setMetadataIndexBit(0);
		level.setMetadataBitCount(4);
		blockProperties.add(level);
	}

	@Override
	public Block getNewBlock() {
		return new BlockLava().setProperty(level.getName(), level.getPropertyByIndex(getMetaBits(4, 0)));
	}

	@Override
	public Block getOldBlock() {
		return new BlockLava().setMetadata(setMetaBits(getProperty(level.getName()).getCurrentIndex(), 0));
	}
}