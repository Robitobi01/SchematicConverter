package net.dugged.schematicconverter.block;

public class BlockSandstone extends Block {
	public BlockSandstone() {
		super("sandstone");
		setOldId(24);
		setOldName("sandstone");
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 1:
				return new BlockChiseledSandstone();
			case 2:
				return new BlockSmoothSandstone();
			default:
				return new BlockSandstone();
		}
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}