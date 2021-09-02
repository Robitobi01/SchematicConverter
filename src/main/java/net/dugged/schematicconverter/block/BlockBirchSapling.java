package net.dugged.schematicconverter.block;

public class BlockBirchSapling extends Block {
	protected static final BlockProperty stage = new BlockProperty("stage", new String[]{"0", "1"});

	public BlockBirchSapling() {
		super("birch_sapling");
		blockProperties.add(stage);
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockOakSapling().setMetadata(setMetaBits(2, stage.getCurrentIndex(), stage.getMetadataIndexBit()));
	}
}