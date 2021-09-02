package net.dugged.schematicconverter.block;

public class BlockChiseledQuartzBlock extends Block {
	public BlockChiseledQuartzBlock() {
		super("chiseled_quartz_block");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockQuartzBlock().setMetadata(1);
	}
}