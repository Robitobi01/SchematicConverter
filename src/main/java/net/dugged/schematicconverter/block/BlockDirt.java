package net.dugged.schematicconverter.block;

public class BlockDirt extends Block {
	public BlockDirt() {
		super("dirt");
		setOldId(3);
		setOldName("dirt");
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 1:
				return new BlockCoarseDirt();
			case 2:
				return new BlockPodzol();
			default:
				return new BlockDirt();
		}
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}