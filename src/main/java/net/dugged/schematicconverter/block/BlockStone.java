package net.dugged.schematicconverter.block;

public class BlockStone extends Block {
	public BlockStone() {
		super("stone");
		setOldId(1);
		setOldName("stone");
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 1:
				return new BlockGranite();
			case 2:
				return new BlockPolishedGranite();
			case 3:
				return new BlockDiorite();
			case 4:
				return new BlockPolishedDiorite();
			case 5:
				return new BlockAndesite();
			case 6:
				return new BlockPolishedAndesite();
			default:
				return new BlockStone();
		}
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}
