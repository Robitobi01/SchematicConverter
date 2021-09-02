package net.dugged.schematicconverter.block;

public class BlockCocoa extends Block {
	protected static final BlockProperty age = new BlockProperty("age", new String[]{"0", "1", "2"});
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "east", "south", "west"});

	public BlockCocoa() {
		super("cocoa");
		setOldId(127);
		setOldName("cocoa");
		age.setMetadataIndexBit(2);
		age.setMetadataBitCount(2);
		facing.setMetadataIndexBit(0);
		facing.setMetadataBitCount(2);
		blockProperties.add(age);
		blockProperties.add(facing);
	}

	@Override
	public Block getNewBlock() {
		Block block = new BlockCocoa().setProperty(facing.getName(), facing.getPropertyByIndex(getMetaBits(facing.getMetadataBitCount(), facing.getMetadataIndexBit())));
		return block.setProperty(age.getName(), age.getPropertyByIndex(getMetaBits(age.getMetadataBitCount(), age.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		Block block = new BlockCocoa().setMetadata(setMetaBits(facing.getCurrentIndex(), facing.getMetadataIndexBit()));
		return block.setMetadata(block.setMetaBits(age.getCurrentIndex(), age.getMetadataIndexBit()));
	}
}