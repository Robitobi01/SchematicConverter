package net.dugged.schematicconverter.block;

public class BlockSpruceSapling extends Block {
	protected static final BlockProperty stage = new BlockProperty("stage", new String[]{"0", "1"});

	public BlockSpruceSapling() {
		super("spruce_sapling");
		blockProperties.add(stage);
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockOakSapling().setMetadata(setMetaBits(1, stage.getCurrentIndex(), stage.getMetadataIndexBit()));
	}
}