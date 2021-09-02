package net.dugged.schematicconverter.block;

public class BlockPrismarineBricks extends Block {
	public BlockPrismarineBricks() {
		super("prismarine_bricks");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockPrismarine().setMetadata(2);
	}
}