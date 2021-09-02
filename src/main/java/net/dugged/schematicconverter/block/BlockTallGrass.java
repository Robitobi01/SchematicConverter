package net.dugged.schematicconverter.block;

public class BlockTallGrass extends Block {
	protected static final BlockProperty half = new BlockProperty("half", new String[]{"upper", "lower"});

	public BlockTallGrass() {
		super("tall_grass");
		setOldId(175);
		setOldName("double_plant");
		half.setMetadataIndexBit(3);
		half.setMetadataBitCount(1);
		blockProperties.add(half);
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 0:
				return new BlockSunflower().setProperty(BlockSunflower.half.getName(), BlockSunflower.half.getPropertyByIndex(getMetaBits(half.getMetadataBitCount(), half.getMetadataIndexBit())));
			case 1:
				return new BlockLilac().setProperty(BlockSunflower.half.getName(), BlockSunflower.half.getPropertyByIndex(getMetaBits(half.getMetadataBitCount(), half.getMetadataIndexBit())));
			case 3:
				return new BlockLargeFern().setProperty(BlockSunflower.half.getName(), BlockSunflower.half.getPropertyByIndex(getMetaBits(half.getMetadataBitCount(), half.getMetadataIndexBit())));
			case 4:
				return new BlockRoseBush().setProperty(BlockSunflower.half.getName(), BlockSunflower.half.getPropertyByIndex(getMetaBits(half.getMetadataBitCount(), half.getMetadataIndexBit())));
			case 5:
				return new BlockPeony().setProperty(BlockSunflower.half.getName(), BlockSunflower.half.getPropertyByIndex(getMetaBits(half.getMetadataBitCount(), half.getMetadataIndexBit())));
			default:
				return new BlockTallGrass().setProperty(BlockSunflower.half.getName(), BlockSunflower.half.getPropertyByIndex(getMetaBits(half.getMetadataBitCount(), half.getMetadataIndexBit())));
		}
	}

	@Override
	public Block getOldBlock() {
		return new BlockTallGrass().setMetadata(setMetaBits(2, BlockTallGrass.half.getCurrentIndex(), BlockTallGrass.half.getMetadataIndexBit()));
	}
}