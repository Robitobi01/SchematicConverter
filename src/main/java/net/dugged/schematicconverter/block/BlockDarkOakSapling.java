package net.dugged.schematicconverter.block;

public class BlockDarkOakSapling extends Block {
	protected static final BlockProperty stage = new BlockProperty("stage", new String[]{"0", "1"});

	public BlockDarkOakSapling() {
		super("dark_oak_sapling");
		blockProperties.add(stage);
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockOakSapling().setMetadata(setMetaBits(5, stage.getCurrentIndex(), stage.getMetadataIndexBit()));
	}
}