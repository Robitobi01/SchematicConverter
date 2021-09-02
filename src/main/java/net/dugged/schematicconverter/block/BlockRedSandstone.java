package net.dugged.schematicconverter.block;

public class BlockRedSandstone extends Block {
	public BlockRedSandstone() {
		super("red_sandstone");
		setOldId(179);
		setOldName("red_sandstone");
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 1:
				return new BlockChiseledRedSandstone();
			case 2:
				return new BlockSmoothRedSandstone();
			default:
				return new BlockRedSandstone();
		}
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}