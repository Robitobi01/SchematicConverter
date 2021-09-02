package net.dugged.schematicconverter.block;

public class BlockChainCommandBlock extends Block {
	protected static final BlockProperty conditional = new BlockProperty("conditional", new String[]{"false", "true"});
	protected static final BlockProperty facing = new BlockProperty("facing", new String[]{"down", "up", "north", "south", "west", "east"});

	public BlockChainCommandBlock() {
		super("chain_command_block");
		setOldId(211);
		setOldName("chain_command_block");
		conditional.setMetadataIndexBit(3);
		conditional.setMetadataBitCount(1);
		facing.setMetadataIndexBit(0);
		facing.setMetadataBitCount(3);
		blockProperties.add(conditional);
		blockProperties.add(facing);
	}

	@Override
	public Block getNewBlock() {
		Block block = new BlockChainCommandBlock().setProperty(facing.getName(), facing.getPropertyByIndex(getMetaBits(facing.getMetadataBitCount(), facing.getMetadataIndexBit())));
		return block.setProperty(conditional.getName(), conditional.getPropertyByIndex(getMetaBits(conditional.getMetadataBitCount(), conditional.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		Block block = new BlockChainCommandBlock().setMetadata(setMetaBits(facing.getCurrentIndex(), facing.getMetadataIndexBit()));
		return block.setMetadata(block.setMetaBits(conditional.getCurrentIndex(), conditional.getMetadataIndexBit()));
	}
}