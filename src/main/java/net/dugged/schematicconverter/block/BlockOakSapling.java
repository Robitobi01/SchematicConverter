package net.dugged.schematicconverter.block;

public class BlockOakSapling extends Block {
	protected static final BlockProperty stage = new BlockProperty("stage", new String[]{"0", "1"});

	public BlockOakSapling() {
		super("oak_sapling");
		setOldId(6);
		setOldName("sapling");
		stage.setMetadataIndexBit(3);
		stage.setMetadataBitCount(1);
		blockProperties.add(stage);
	}

	@Override
	public Block getNewBlock() {
		int index = getMetaBits(1, 3);
		Block block;
		switch (getMetaBits(3, 0)) {
			case 1:
				block = new BlockSpruceSapling();
				return block.setProperty(BlockSpruceSapling.stage.getName(), block.getProperty(BlockSpruceSapling.stage.getName()).getPropertyByIndex(index));
			case 2:
				block = new BlockBirchSapling();
				return block.setProperty(BlockBirchSapling.stage.getName(), block.getProperty(BlockBirchSapling.stage.getName()).getPropertyByIndex(index));
			case 3:
				block = new BlockJungleSapling();
				return block.setProperty(BlockJungleSapling.stage.getName(), block.getProperty(BlockJungleSapling.stage.getName()).getPropertyByIndex(index));
			case 4:
				block = new BlockAcaciaSapling();
				return block.setProperty(BlockAcaciaSapling.stage.getName(), block.getProperty(BlockAcaciaSapling.stage.getName()).getPropertyByIndex(index));
			case 5:
				block = new BlockDarkOakSapling();
				return block.setProperty(BlockDarkOakSapling.stage.getName(), block.getProperty(BlockDarkOakSapling.stage.getName()).getPropertyByIndex(index));
			default:
				return new BlockOakSapling().setProperty(stage.getName(), stage.getPropertyByIndex(index));
		}
	}

	@Override
	public Block getOldBlock() {
		return new BlockOakSapling().setMetadata(setMetaBits(stage.getCurrentIndex(), stage.getMetadataIndexBit()));
	}
}