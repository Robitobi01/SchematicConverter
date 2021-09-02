package net.dugged.schematicconverter.block;

public class BlockChippedAnvil extends Block {
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"north", "east", "south", "west"});

	public BlockChippedAnvil() {
		super("chipped_anvil");
		blockProperties.add(facing);
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockAnvil().setMetadata(setMetaBits(4, facing.getCurrentIndex(), BlockAnvil.facing.getMetadataIndexBit()));
	}
}