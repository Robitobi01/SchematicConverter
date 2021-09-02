package net.dugged.schematicconverter.block;

public class BlockPrismarine extends Block {
	public BlockPrismarine() {
		super("prismarine");
		setOldId(168);
		setOldName("prismarine");
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 1:
				return new BlockDarkPrismarine();
			case 2:
				return new BlockPrismarineBricks();
			default:
				return new BlockPrismarine();
		}
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}