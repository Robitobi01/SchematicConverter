package net.dugged.schematicconverter.block;

public class BlockEndPortalFrame extends Block {
	protected static final BlockProperty eye = new BlockProperty("eye", new String[]{"false", "true"});
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "south", "west", "east"});

	public BlockEndPortalFrame() {
		super("end_portal_frame");
		setOldId(120);
		setOldName("end_portal_frame");
		facing.setMetadataIndexBit(0);
		facing.setMetadataBitCount(2);
		eye.setMetadataIndexBit(2);
		eye.setMetadataBitCount(1);
		blockProperties.add(eye);
		blockProperties.add(facing);
	}

	@Override
	public Block getNewBlock() {
		Block block = new BlockEndPortalFrame().setProperty(facing.getName(), facing.getPropertyByIndex(getMetaBits(facing.getMetadataBitCount(), facing.getMetadataIndexBit())));
		return block.setProperty(eye.getName(), eye.getPropertyByIndex(getMetaBits(eye.getMetadataBitCount(), eye.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		Block block = new BlockEndPortalFrame().setMetadata(setMetaBits(facing.getCurrentIndex(), facing.getMetadataIndexBit()));
		return block.setMetadata(block.setMetaBits(eye.getCurrentIndex(), eye.getMetadataIndexBit()));
	}
}